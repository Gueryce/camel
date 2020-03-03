/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.aggregator;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.Registry;
import org.junit.Test;

public class AggregationStrategyBeanAdapterRefMethodNameTest extends ContextTestSupport {

    @Override
    protected Registry createRegistry() throws Exception {
        Registry jndi = super.createRegistry();
        jndi.bind("myAppender", new AggregationStrategyBeanAdapterRefMethodNameTest.MyBodyAppender());
        return jndi;
    }

    @Test
    public void testAggregate() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("ABC");

        template.sendBody("direct:start", "A");
        template.sendBody("direct:start", "B");
        template.sendBody("direct:start", "C");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").aggregate(constant(true)).aggregationStrategyRef("myAppender").aggregationStrategyMethodName("append").completionSize(3).to("mock:result");
            }
        };
    }

    public static final class MyBodyAppender {

        public String append(String existing, String next) {
            if (next != null) {
                return existing + next;
            } else {
                return existing;
            }
        }

        public String foo(String foo, String bar) {
            return "foobar";
        }

    }
}

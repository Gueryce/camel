/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ahc;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AhcEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AhcEndpoint target = (AhcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": target.setBinding(property(camelContext, org.apache.camel.component.ahc.AhcBinding.class, value)); return true;
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.setBufferSize(property(camelContext, int.class, value)); return true;
        case "clientconfig":
        case "clientConfig": target.setClientConfig(property(camelContext, org.asynchttpclient.AsyncHttpClientConfig.class, value)); return true;
        case "clientconfigoptions":
        case "clientConfigOptions": target.setClientConfigOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "clientconfigrealmoptions":
        case "clientConfigRealmOptions": target.setClientConfigRealmOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "connectionclose":
        case "connectionClose": target.setConnectionClose(property(camelContext, boolean.class, value)); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": return org.apache.camel.component.ahc.AhcBinding.class;
        case "bridgeendpoint":
        case "bridgeEndpoint": return boolean.class;
        case "buffersize":
        case "bufferSize": return int.class;
        case "clientconfig":
        case "clientConfig": return org.asynchttpclient.AsyncHttpClientConfig.class;
        case "clientconfigoptions":
        case "clientConfigOptions": return java.util.Map.class;
        case "clientconfigrealmoptions":
        case "clientConfigRealmOptions": return java.util.Map.class;
        case "connectionclose":
        case "connectionClose": return boolean.class;
        case "cookiehandler":
        case "cookieHandler": return org.apache.camel.http.base.cookie.CookieHandler.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return boolean.class;
        case "transferexception":
        case "transferException": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AhcEndpoint target = (AhcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": return target.getBinding();
        case "bridgeendpoint":
        case "bridgeEndpoint": return target.isBridgeEndpoint();
        case "buffersize":
        case "bufferSize": return target.getBufferSize();
        case "clientconfig":
        case "clientConfig": return target.getClientConfig();
        case "clientconfigoptions":
        case "clientConfigOptions": return target.getClientConfigOptions();
        case "clientconfigrealmoptions":
        case "clientConfigRealmOptions": return target.getClientConfigRealmOptions();
        case "connectionclose":
        case "connectionClose": return target.isConnectionClose();
        case "cookiehandler":
        case "cookieHandler": return target.getCookieHandler();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return target.isThrowExceptionOnFailure();
        case "transferexception":
        case "transferException": return target.isTransferException();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientconfigoptions":
        case "clientConfigOptions": return java.lang.Object.class;
        case "clientconfigrealmoptions":
        case "clientConfigRealmOptions": return java.lang.Object.class;
        default: return null;
        }
    }
}


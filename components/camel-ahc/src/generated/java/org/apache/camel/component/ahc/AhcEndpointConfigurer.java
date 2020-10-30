/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ahc;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AhcEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("httpUri", java.net.URI.class);
        map.put("bridgeEndpoint", boolean.class);
        map.put("bufferSize", int.class);
        map.put("connectionClose", boolean.class);
        map.put("cookieHandler", org.apache.camel.http.base.cookie.CookieHandler.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("throwExceptionOnFailure", boolean.class);
        map.put("transferException", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("binding", org.apache.camel.component.ahc.AhcBinding.class);
        map.put("clientConfig", org.asynchttpclient.AsyncHttpClientConfig.class);
        map.put("clientConfigOptions", java.util.Map.class);
        map.put("synchronous", boolean.class);
        map.put("clientConfigRealmOptions", java.util.Map.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(AhcEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AhcEndpoint target = (AhcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
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
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AhcEndpoint target = (AhcEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
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
}


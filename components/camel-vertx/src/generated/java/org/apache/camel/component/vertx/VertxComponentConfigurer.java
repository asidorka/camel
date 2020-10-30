/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx;

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
public class VertxComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", int.class);
        map.put("timeout", int.class);
        map.put("vertx", io.vertx.core.Vertx.class);
        map.put("vertxOptions", io.vertx.core.VertxOptions.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("vertxFactory", io.vertx.core.spi.VertxFactory.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(VertxComponentConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxComponent target = (VertxComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        case "vertx": target.setVertx(property(camelContext, io.vertx.core.Vertx.class, value)); return true;
        case "vertxfactory":
        case "vertxFactory": target.setVertxFactory(property(camelContext, io.vertx.core.spi.VertxFactory.class, value)); return true;
        case "vertxoptions":
        case "vertxOptions": target.setVertxOptions(property(camelContext, io.vertx.core.VertxOptions.class, value)); return true;
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
        VertxComponent target = (VertxComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "port": return target.getPort();
        case "timeout": return target.getTimeout();
        case "vertx": return target.getVertx();
        case "vertxfactory":
        case "vertxFactory": return target.getVertxFactory();
        case "vertxoptions":
        case "vertxOptions": return target.getVertxOptions();
        default: return null;
        }
    }
}


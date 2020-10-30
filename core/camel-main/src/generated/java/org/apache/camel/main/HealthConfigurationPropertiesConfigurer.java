/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HealthConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HealthConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Config", java.util.Map.class);
        map.put("ContextEnabled", java.lang.Boolean.class);
        map.put("Enabled", java.lang.Boolean.class);
        map.put("RegistryEnabled", java.lang.Boolean.class);
        map.put("RoutesEnabled", java.lang.Boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(HealthConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
        ConfigurerStrategy.addConfigurerClearer(HealthConfigurationPropertiesConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "config":
        case "Config": target.setConfig(property(camelContext, java.util.Map.class, value)); return true;
        case "contextenabled":
        case "ContextEnabled": target.setContextEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "enabled":
        case "Enabled": target.setEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "registryenabled":
        case "RegistryEnabled": target.setRegistryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "routesenabled":
        case "RoutesEnabled": target.setRoutesEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "config":
        case "Config": return target.getConfig();
        case "contextenabled":
        case "ContextEnabled": return target.getContextEnabled();
        case "enabled":
        case "Enabled": return target.getEnabled();
        case "registryenabled":
        case "RegistryEnabled": return target.getRegistryEnabled();
        case "routesenabled":
        case "RoutesEnabled": return target.getRoutesEnabled();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "config":
        case "Config": return org.apache.camel.main.HealthCheckConfigurationProperties.class;
        default: return null;
        }
    }
}


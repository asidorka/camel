/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.microprofile.metrics;

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
public class MicroProfileMetricsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("metricType", org.eclipse.microprofile.metrics.MetricType.class);
        map.put("metricName", java.lang.String.class);
        map.put("action", java.lang.String.class);
        map.put("counterIncrement", java.lang.Long.class);
        map.put("description", java.lang.String.class);
        map.put("displayName", java.lang.String.class);
        map.put("gaugeDecrement", java.lang.Boolean.class);
        map.put("gaugeIncrement", java.lang.Boolean.class);
        map.put("gaugeValue", java.lang.Number.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("mark", java.lang.Long.class);
        map.put("metricUnit", java.lang.String.class);
        map.put("tags", java.lang.String.class);
        map.put("value", java.lang.Long.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(MicroProfileMetricsEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MicroProfileMetricsEndpoint target = (MicroProfileMetricsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "counterincrement":
        case "counterIncrement": target.setCounterIncrement(property(camelContext, java.lang.Long.class, value)); return true;
        case "description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "displayname":
        case "displayName": target.setDisplayName(property(camelContext, java.lang.String.class, value)); return true;
        case "gaugedecrement":
        case "gaugeDecrement": target.setGaugeDecrement(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "gaugeincrement":
        case "gaugeIncrement": target.setGaugeIncrement(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "gaugevalue":
        case "gaugeValue": target.setGaugeValue(property(camelContext, java.lang.Number.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mark": target.setMark(property(camelContext, java.lang.Long.class, value)); return true;
        case "metricunit":
        case "metricUnit": target.setMetricUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tags": target.setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "value": target.setValue(property(camelContext, java.lang.Long.class, value)); return true;
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
        MicroProfileMetricsEndpoint target = (MicroProfileMetricsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "counterincrement":
        case "counterIncrement": return target.getCounterIncrement();
        case "description": return target.getDescription();
        case "displayname":
        case "displayName": return target.getDisplayName();
        case "gaugedecrement":
        case "gaugeDecrement": return target.getGaugeDecrement();
        case "gaugeincrement":
        case "gaugeIncrement": return target.getGaugeIncrement();
        case "gaugevalue":
        case "gaugeValue": return target.getGaugeValue();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mark": return target.getMark();
        case "metricunit":
        case "metricUnit": return target.getMetricUnit();
        case "synchronous": return target.isSynchronous();
        case "tags": return target.getTags();
        case "value": return target.getValue();
        default: return null;
        }
    }
}


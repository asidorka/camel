/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt.saxon;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.xslt.XsltEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XsltSaxonEndpointConfigurer extends XsltEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("resourceUri", java.lang.String.class);
        map.put("allowStAX", boolean.class);
        map.put("contentCache", boolean.class);
        map.put("deleteOutputFile", boolean.class);
        map.put("failOnNullBody", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("output", org.apache.camel.component.xslt.XsltOutput.class);
        map.put("transformerCacheSize", int.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("entityResolver", org.xml.sax.EntityResolver.class);
        map.put("errorListener", javax.xml.transform.ErrorListener.class);
        map.put("resultHandlerFactory", org.apache.camel.component.xslt.ResultHandlerFactory.class);
        map.put("saxonConfiguration", net.sf.saxon.Configuration.class);
        map.put("saxonExtensionFunctions", java.lang.String.class);
        map.put("synchronous", boolean.class);
        map.put("transformerFactory", javax.xml.transform.TransformerFactory.class);
        map.put("transformerFactoryClass", java.lang.String.class);
        map.put("transformerFactoryConfigurationStrategy", org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
        map.put("uriResolver", javax.xml.transform.URIResolver.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(XsltSaxonEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XsltSaxonEndpoint target = (XsltSaxonEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowstax":
        case "allowStAX": target.setAllowStAX(property(camelContext, boolean.class, value)); return true;
        case "saxonconfiguration":
        case "saxonConfiguration": target.setSaxonConfiguration(property(camelContext, net.sf.saxon.Configuration.class, value)); return true;
        case "saxonextensionfunctions":
        case "saxonExtensionFunctions": target.setSaxonExtensionFunctions(property(camelContext, java.lang.String.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
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
        XsltSaxonEndpoint target = (XsltSaxonEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowstax":
        case "allowStAX": return target.isAllowStAX();
        case "saxonconfiguration":
        case "saxonConfiguration": return target.getSaxonConfiguration();
        case "saxonextensionfunctions":
        case "saxonExtensionFunctions": return target.getSaxonExtensionFunctions();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}


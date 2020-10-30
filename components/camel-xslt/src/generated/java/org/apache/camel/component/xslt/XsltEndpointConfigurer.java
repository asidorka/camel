/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt;

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
public class XsltEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("resourceUri", java.lang.String.class);
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
        map.put("synchronous", boolean.class);
        map.put("transformerFactory", javax.xml.transform.TransformerFactory.class);
        map.put("transformerFactoryClass", java.lang.String.class);
        map.put("transformerFactoryConfigurationStrategy", org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
        map.put("uriResolver", javax.xml.transform.URIResolver.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(XsltEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XsltEndpoint target = (XsltEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "deleteoutputfile":
        case "deleteOutputFile": target.setDeleteOutputFile(property(camelContext, boolean.class, value)); return true;
        case "entityresolver":
        case "entityResolver": target.setEntityResolver(property(camelContext, org.xml.sax.EntityResolver.class, value)); return true;
        case "errorlistener":
        case "errorListener": target.setErrorListener(property(camelContext, javax.xml.transform.ErrorListener.class, value)); return true;
        case "failonnullbody":
        case "failOnNullBody": target.setFailOnNullBody(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "output": target.setOutput(property(camelContext, org.apache.camel.component.xslt.XsltOutput.class, value)); return true;
        case "resulthandlerfactory":
        case "resultHandlerFactory": target.setResultHandlerFactory(property(camelContext, org.apache.camel.component.xslt.ResultHandlerFactory.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transformercachesize":
        case "transformerCacheSize": target.setTransformerCacheSize(property(camelContext, int.class, value)); return true;
        case "transformerfactory":
        case "transformerFactory": target.setTransformerFactory(property(camelContext, javax.xml.transform.TransformerFactory.class, value)); return true;
        case "transformerfactoryclass":
        case "transformerFactoryClass": target.setTransformerFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "transformerfactoryconfigurationstrategy":
        case "transformerFactoryConfigurationStrategy": target.setTransformerFactoryConfigurationStrategy(property(camelContext, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class, value)); return true;
        case "uriresolver":
        case "uriResolver": target.setUriResolver(property(camelContext, javax.xml.transform.URIResolver.class, value)); return true;
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
        XsltEndpoint target = (XsltEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "deleteoutputfile":
        case "deleteOutputFile": return target.isDeleteOutputFile();
        case "entityresolver":
        case "entityResolver": return target.getEntityResolver();
        case "errorlistener":
        case "errorListener": return target.getErrorListener();
        case "failonnullbody":
        case "failOnNullBody": return target.isFailOnNullBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "output": return target.getOutput();
        case "resulthandlerfactory":
        case "resultHandlerFactory": return target.getResultHandlerFactory();
        case "synchronous": return target.isSynchronous();
        case "transformercachesize":
        case "transformerCacheSize": return target.getTransformerCacheSize();
        case "transformerfactory":
        case "transformerFactory": return target.getTransformerFactory();
        case "transformerfactoryclass":
        case "transformerFactoryClass": return target.getTransformerFactoryClass();
        case "transformerfactoryconfigurationstrategy":
        case "transformerFactoryConfigurationStrategy": return target.getTransformerFactoryConfigurationStrategy();
        case "uriresolver":
        case "uriResolver": return target.getUriResolver();
        default: return null;
        }
    }
}


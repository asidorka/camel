/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

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
public class SjmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("connectionCount", java.lang.Integer.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("reconnectBackOff", long.class);
        map.put("reconnectOnError", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionClientId", java.lang.String.class);
        map.put("connectionFactory", javax.jms.ConnectionFactory.class);
        map.put("connectionMaxWait", long.class);
        map.put("connectionResource", org.apache.camel.component.sjms.jms.ConnectionResource.class);
        map.put("connectionTestOnBorrow", boolean.class);
        map.put("destinationCreationStrategy", org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
        map.put("timedTaskManager", org.apache.camel.component.sjms.taskmanager.TimedTaskManager.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("connectionPassword", java.lang.String.class);
        map.put("connectionUsername", java.lang.String.class);
        map.put("transactionCommitStrategy", org.apache.camel.component.sjms.TransactionCommitStrategy.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(SjmsComponentConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SjmsComponent target = (SjmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connectionclientid":
        case "connectionClientId": target.setConnectionClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "connectioncount":
        case "connectionCount": target.setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionmaxwait":
        case "connectionMaxWait": target.setConnectionMaxWait(property(camelContext, long.class, value)); return true;
        case "connectionpassword":
        case "connectionPassword": target.setConnectionPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionresource":
        case "connectionResource": target.setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "connectiontestonborrow":
        case "connectionTestOnBorrow": target.setConnectionTestOnBorrow(property(camelContext, boolean.class, value)); return true;
        case "connectionusername":
        case "connectionUsername": target.setConnectionUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": target.setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "reconnectbackoff":
        case "reconnectBackOff": target.setReconnectBackOff(property(camelContext, long.class, value)); return true;
        case "reconnectonerror":
        case "reconnectOnError": target.setReconnectOnError(property(camelContext, boolean.class, value)); return true;
        case "timedtaskmanager":
        case "timedTaskManager": target.setTimedTaskManager(property(camelContext, org.apache.camel.component.sjms.taskmanager.TimedTaskManager.class, value)); return true;
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": target.setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
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
        SjmsComponent target = (SjmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connectionclientid":
        case "connectionClientId": return target.getConnectionClientId();
        case "connectioncount":
        case "connectionCount": return target.getConnectionCount();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "connectionmaxwait":
        case "connectionMaxWait": return target.getConnectionMaxWait();
        case "connectionpassword":
        case "connectionPassword": return target.getConnectionPassword();
        case "connectionresource":
        case "connectionResource": return target.getConnectionResource();
        case "connectiontestonborrow":
        case "connectionTestOnBorrow": return target.isConnectionTestOnBorrow();
        case "connectionusername":
        case "connectionUsername": return target.getConnectionUsername();
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": return target.getDestinationCreationStrategy();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return target.getJmsKeyFormatStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return target.getMessageCreatedStrategy();
        case "reconnectbackoff":
        case "reconnectBackOff": return target.getReconnectBackOff();
        case "reconnectonerror":
        case "reconnectOnError": return target.isReconnectOnError();
        case "timedtaskmanager":
        case "timedTaskManager": return target.getTimedTaskManager();
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": return target.getTransactionCommitStrategy();
        default: return null;
        }
    }
}


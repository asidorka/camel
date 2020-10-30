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
public class SjmsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("destinationType", java.lang.String.class);
        map.put("destinationName", java.lang.String.class);
        map.put("acknowledgementMode", org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("consumerCount", int.class);
        map.put("durableSubscriptionId", java.lang.String.class);
        map.put("reconnectBackOff", long.class);
        map.put("reconnectOnError", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("messageSelector", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("namedReplyTo", java.lang.String.class);
        map.put("persistent", boolean.class);
        map.put("producerCount", int.class);
        map.put("ttl", long.class);
        map.put("allowNullBody", boolean.class);
        map.put("prefillPool", boolean.class);
        map.put("responseTimeOut", long.class);
        map.put("asyncStartListener", boolean.class);
        map.put("asyncStopListener", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionCount", java.lang.Integer.class);
        map.put("connectionFactory", javax.jms.ConnectionFactory.class);
        map.put("connectionResource", org.apache.camel.component.sjms.jms.ConnectionResource.class);
        map.put("destinationCreationStrategy", org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
        map.put("exceptionListener", javax.jms.ExceptionListener.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("includeAllJMSXProperties", boolean.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
        map.put("mapJmsMessage", boolean.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
        map.put("errorHandlerLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("errorHandlerLogStackTrace", boolean.class);
        map.put("transacted", boolean.class);
        map.put("transactionBatchCount", int.class);
        map.put("transactionBatchTimeout", long.class);
        map.put("transactionCommitStrategy", org.apache.camel.component.sjms.TransactionCommitStrategy.class);
        map.put("sharedJMSSession", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(SjmsEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SjmsEndpoint target = (SjmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": target.setAcknowledgementMode(property(camelContext, org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": target.setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener":
        case "asyncStopListener": target.setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connectioncount":
        case "connectionCount": target.setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionresource":
        case "connectionResource": target.setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "consumercount":
        case "consumerCount": target.setConsumerCount(property(camelContext, int.class, value)); return true;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": target.setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "durablesubscriptionid":
        case "durableSubscriptionId": target.setDurableSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": target.setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": target.setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exceptionlistener":
        case "exceptionListener": target.setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": target.setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": target.setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "messageselector":
        case "messageSelector": target.setMessageSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "namedreplyto":
        case "namedReplyTo": target.setNamedReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": target.setPersistent(property(camelContext, boolean.class, value)); return true;
        case "prefillpool":
        case "prefillPool": target.setPrefillPool(property(camelContext, boolean.class, value)); return true;
        case "producercount":
        case "producerCount": target.setProducerCount(property(camelContext, int.class, value)); return true;
        case "reconnectbackoff":
        case "reconnectBackOff": target.setReconnectBackOff(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "reconnectonerror":
        case "reconnectOnError": target.setReconnectOnError(property(camelContext, boolean.class, value)); return true;
        case "responsetimeout":
        case "responseTimeOut": target.setResponseTimeOut(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "sharedjmssession":
        case "sharedJMSSession": target.setSharedJMSSession(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transactionbatchcount":
        case "transactionBatchCount": target.setTransactionBatchCount(property(camelContext, int.class, value)); return true;
        case "transactionbatchtimeout":
        case "transactionBatchTimeout": target.setTransactionBatchTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": target.setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
        case "ttl": target.setTtl(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
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
        SjmsEndpoint target = (SjmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": return target.getAcknowledgementMode();
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "asyncstartlistener":
        case "asyncStartListener": return target.isAsyncStartListener();
        case "asyncstoplistener":
        case "asyncStopListener": return target.isAsyncStopListener();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connectioncount":
        case "connectionCount": return target.getConnectionCount();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "connectionresource":
        case "connectionResource": return target.getConnectionResource();
        case "consumercount":
        case "consumerCount": return target.getConsumerCount();
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": return target.getDestinationCreationStrategy();
        case "durablesubscriptionid":
        case "durableSubscriptionId": return target.getDurableSubscriptionId();
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": return target.isErrorHandlerLogStackTrace();
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": return target.getErrorHandlerLoggingLevel();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exceptionlistener":
        case "exceptionListener": return target.getExceptionListener();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": return target.isIncludeAllJMSXProperties();
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return target.getJmsKeyFormatStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mapjmsmessage":
        case "mapJmsMessage": return target.isMapJmsMessage();
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return target.getMessageCreatedStrategy();
        case "messageselector":
        case "messageSelector": return target.getMessageSelector();
        case "namedreplyto":
        case "namedReplyTo": return target.getNamedReplyTo();
        case "persistent": return target.isPersistent();
        case "prefillpool":
        case "prefillPool": return target.isPrefillPool();
        case "producercount":
        case "producerCount": return target.getProducerCount();
        case "reconnectbackoff":
        case "reconnectBackOff": return target.getReconnectBackOff();
        case "reconnectonerror":
        case "reconnectOnError": return target.isReconnectOnError();
        case "responsetimeout":
        case "responseTimeOut": return target.getResponseTimeOut();
        case "sharedjmssession":
        case "sharedJMSSession": return target.isSharedJMSSession();
        case "synchronous": return target.isSynchronous();
        case "transacted": return target.isTransacted();
        case "transactionbatchcount":
        case "transactionBatchCount": return target.getTransactionBatchCount();
        case "transactionbatchtimeout":
        case "transactionBatchTimeout": return target.getTransactionBatchTimeout();
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": return target.getTransactionCommitStrategy();
        case "ttl": return target.getTtl();
        default: return null;
        }
    }
}


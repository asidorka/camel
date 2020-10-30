/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.crypto.cms;

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
public class CryptoCmsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("cryptoOperation", org.apache.camel.component.crypto.cms.CryptoOperation.class);
        map.put("name", java.lang.String.class);
        map.put("keyStore", java.security.KeyStore.class);
        map.put("keyStoreParameters", org.apache.camel.support.jsse.KeyStoreParameters.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("password", char[].class);
        map.put("fromBase64", boolean.class);
        map.put("contentEncryptionAlgorithm", java.lang.String.class);
        map.put("originatorInformationProvider", org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider.class);
        map.put("recipient", java.util.List.class);
        map.put("secretKeyLength", int.class);
        map.put("unprotectedAttributesGeneratorProvider", org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider.class);
        map.put("toBase64", java.lang.Boolean.class);
        map.put("includeContent", java.lang.Boolean.class);
        map.put("signer", java.lang.String.class);
        map.put("signedDataHeaderBase64", boolean.class);
        map.put("verifySignaturesOfAllSigners", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(CryptoCmsEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CryptoCmsEndpoint target = (CryptoCmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "contentencryptionalgorithm":
        case "contentEncryptionAlgorithm": target.getEncryptConfig().setContentEncryptionAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "frombase64":
        case "fromBase64": target.getVerifyConfig().setFromBase64(property(camelContext, boolean.class, value)); return true;
        case "includecontent":
        case "includeContent": target.getSignConfig().setIncludeContent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keystore":
        case "keyStore": target.getVerifyConfig().setKeyStore(property(camelContext, java.security.KeyStore.class, value)); return true;
        case "keystoreparameters":
        case "keyStoreParameters": target.getVerifyConfig().setKeyStoreParameters(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "originatorinformationprovider":
        case "originatorInformationProvider": target.getEncryptConfig().setOriginatorInformationProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider.class, value)); return true;
        case "password": target.getDecryptConfig().setPassword(property(camelContext, char[].class, value)); return true;
        case "recipient": target.getEncryptConfig().setRecipient(property(camelContext, java.util.List.class, value)); return true;
        case "secretkeylength":
        case "secretKeyLength": target.getEncryptConfig().setSecretKeyLength(property(camelContext, int.class, value)); return true;
        case "signeddataheaderbase64":
        case "signedDataHeaderBase64": target.getVerifyConfig().setSignedDataHeaderBase64(property(camelContext, boolean.class, value)); return true;
        case "signer": target.getSignConfig().setSigner(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tobase64":
        case "toBase64": target.getSignConfig().setToBase64(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "unprotectedattributesgeneratorprovider":
        case "unprotectedAttributesGeneratorProvider": target.getEncryptConfig().setUnprotectedAttributesGeneratorProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider.class, value)); return true;
        case "verifysignaturesofallsigners":
        case "verifySignaturesOfAllSigners": target.getVerifyConfig().setVerifySignaturesOfAllSigners(property(camelContext, boolean.class, value)); return true;
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
        CryptoCmsEndpoint target = (CryptoCmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "contentencryptionalgorithm":
        case "contentEncryptionAlgorithm": return target.getEncryptConfig().getContentEncryptionAlgorithm();
        case "frombase64":
        case "fromBase64": return target.getVerifyConfig().isFromBase64();
        case "includecontent":
        case "includeContent": return target.getSignConfig().getIncludeContent();
        case "keystore":
        case "keyStore": return target.getVerifyConfig().getKeyStore();
        case "keystoreparameters":
        case "keyStoreParameters": return target.getVerifyConfig().getKeyStoreParameters();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "originatorinformationprovider":
        case "originatorInformationProvider": return target.getEncryptConfig().getOriginatorInformationProvider();
        case "password": return target.getDecryptConfig().getPassword();
        case "recipient": return target.getEncryptConfig().getRecipient();
        case "secretkeylength":
        case "secretKeyLength": return target.getEncryptConfig().getSecretKeyLength();
        case "signeddataheaderbase64":
        case "signedDataHeaderBase64": return target.getVerifyConfig().isSignedDataHeaderBase64();
        case "signer": return target.getSignConfig().getSigner();
        case "synchronous": return target.isSynchronous();
        case "tobase64":
        case "toBase64": return target.getSignConfig().getToBase64();
        case "unprotectedattributesgeneratorprovider":
        case "unprotectedAttributesGeneratorProvider": return target.getEncryptConfig().getUnprotectedAttributesGeneratorProvider();
        case "verifysignaturesofallsigners":
        case "verifySignaturesOfAllSigners": return target.getVerifyConfig().isVerifySignaturesOfAllSigners();
        default: return null;
        }
    }
}


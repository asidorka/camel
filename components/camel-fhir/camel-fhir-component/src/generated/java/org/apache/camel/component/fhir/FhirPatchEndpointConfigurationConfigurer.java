/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.fhir;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.fhir.FhirPatchEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FhirPatchEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.fhir.internal.FhirApiName.class);
        map.put("Client", ca.uhn.fhir.rest.client.api.IGenericClient.class);
        map.put("ClientFactory", ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
        map.put("Compress", boolean.class);
        map.put("ConnectionTimeout", java.lang.Integer.class);
        map.put("DeferModelScanning", boolean.class);
        map.put("Encoding", java.lang.String.class);
        map.put("ExtraParameters", java.util.Map.class);
        map.put("FhirContext", ca.uhn.fhir.context.FhirContext.class);
        map.put("FhirVersion", java.lang.String.class);
        map.put("ForceConformanceCheck", boolean.class);
        map.put("Id", org.hl7.fhir.instance.model.api.IIdType.class);
        map.put("Log", boolean.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("PatchBody", java.lang.String.class);
        map.put("PreferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class);
        map.put("PrettyPrint", boolean.class);
        map.put("ProxyHost", java.lang.String.class);
        map.put("ProxyPassword", java.lang.String.class);
        map.put("ProxyPort", java.lang.Integer.class);
        map.put("ProxyUser", java.lang.String.class);
        map.put("ServerUrl", java.lang.String.class);
        map.put("SessionCookie", java.lang.String.class);
        map.put("SocketTimeout", java.lang.Integer.class);
        map.put("StringId", java.lang.String.class);
        map.put("Summary", java.lang.String.class);
        map.put("Url", java.lang.String.class);
        map.put("Username", java.lang.String.class);
        map.put("ValidationMode", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(FhirPatchEndpointConfigurationConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.fhir.FhirPatchEndpointConfiguration target = (org.apache.camel.component.fhir.FhirPatchEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.fhir.internal.FhirApiName.class, value)); return true;
        case "client":
        case "Client": target.setClient(property(camelContext, ca.uhn.fhir.rest.client.api.IGenericClient.class, value)); return true;
        case "clientfactory":
        case "ClientFactory": target.setClientFactory(property(camelContext, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class, value)); return true;
        case "compress":
        case "Compress": target.setCompress(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout":
        case "ConnectionTimeout": target.setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "defermodelscanning":
        case "DeferModelScanning": target.setDeferModelScanning(property(camelContext, boolean.class, value)); return true;
        case "encoding":
        case "Encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "extraparameters":
        case "ExtraParameters": target.setExtraParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "fhircontext":
        case "FhirContext": target.setFhirContext(property(camelContext, ca.uhn.fhir.context.FhirContext.class, value)); return true;
        case "fhirversion":
        case "FhirVersion": target.setFhirVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "forceconformancecheck":
        case "ForceConformanceCheck": target.setForceConformanceCheck(property(camelContext, boolean.class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, org.hl7.fhir.instance.model.api.IIdType.class, value)); return true;
        case "log":
        case "Log": target.setLog(property(camelContext, boolean.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password":
        case "Password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "patchbody":
        case "PatchBody": target.setPatchBody(property(camelContext, java.lang.String.class, value)); return true;
        case "preferreturn":
        case "PreferReturn": target.setPreferReturn(property(camelContext, ca.uhn.fhir.rest.api.PreferReturnEnum.class, value)); return true;
        case "prettyprint":
        case "PrettyPrint": target.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "ProxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "ProxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "ProxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyuser":
        case "ProxyUser": target.setProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "serverurl":
        case "ServerUrl": target.setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "sessioncookie":
        case "SessionCookie": target.setSessionCookie(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "SocketTimeout": target.setSocketTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "stringid":
        case "StringId": target.setStringId(property(camelContext, java.lang.String.class, value)); return true;
        case "summary":
        case "Summary": target.setSummary(property(camelContext, java.lang.String.class, value)); return true;
        case "url":
        case "Url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "Username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "validationmode":
        case "ValidationMode": target.setValidationMode(property(camelContext, java.lang.String.class, value)); return true;
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
        org.apache.camel.component.fhir.FhirPatchEndpointConfiguration target = (org.apache.camel.component.fhir.FhirPatchEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": return target.getAccessToken();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "client":
        case "Client": return target.getClient();
        case "clientfactory":
        case "ClientFactory": return target.getClientFactory();
        case "compress":
        case "Compress": return target.isCompress();
        case "connectiontimeout":
        case "ConnectionTimeout": return target.getConnectionTimeout();
        case "defermodelscanning":
        case "DeferModelScanning": return target.isDeferModelScanning();
        case "encoding":
        case "Encoding": return target.getEncoding();
        case "extraparameters":
        case "ExtraParameters": return target.getExtraParameters();
        case "fhircontext":
        case "FhirContext": return target.getFhirContext();
        case "fhirversion":
        case "FhirVersion": return target.getFhirVersion();
        case "forceconformancecheck":
        case "ForceConformanceCheck": return target.isForceConformanceCheck();
        case "id":
        case "Id": return target.getId();
        case "log":
        case "Log": return target.isLog();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "password":
        case "Password": return target.getPassword();
        case "patchbody":
        case "PatchBody": return target.getPatchBody();
        case "preferreturn":
        case "PreferReturn": return target.getPreferReturn();
        case "prettyprint":
        case "PrettyPrint": return target.isPrettyPrint();
        case "proxyhost":
        case "ProxyHost": return target.getProxyHost();
        case "proxypassword":
        case "ProxyPassword": return target.getProxyPassword();
        case "proxyport":
        case "ProxyPort": return target.getProxyPort();
        case "proxyuser":
        case "ProxyUser": return target.getProxyUser();
        case "serverurl":
        case "ServerUrl": return target.getServerUrl();
        case "sessioncookie":
        case "SessionCookie": return target.getSessionCookie();
        case "sockettimeout":
        case "SocketTimeout": return target.getSocketTimeout();
        case "stringid":
        case "StringId": return target.getStringId();
        case "summary":
        case "Summary": return target.getSummary();
        case "url":
        case "Url": return target.getUrl();
        case "username":
        case "Username": return target.getUsername();
        case "validationmode":
        case "ValidationMode": return target.getValidationMode();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "extraparameters":
        case "ExtraParameters": return java.lang.Object.class;
        default: return null;
        }
    }
}


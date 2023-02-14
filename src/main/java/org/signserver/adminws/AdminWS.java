package org.signserver.adminws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-02-14T14:53:03.882+07:00
 * Generated source version: 3.5.4
 *
 */
@WebService(targetNamespace = "http://adminws.signserver.org/", name = "AdminWS")
@XmlSeeAlso({ObjectFactory.class})
public interface AdminWS {

    @WebMethod
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.WsWorkerStatus getStatus(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "queryArchiveWithIds", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryArchiveWithIds")
    @ResponseWrapper(localName = "queryArchiveWithIdsResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryArchiveWithIdsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.signserver.adminws.ArchiveEntry> queryArchiveWithIds(

        @WebParam(name = "uniqueIds", targetNamespace = "")
        java.util.List<java.lang.String> uniqueIds,
        @WebParam(name = "includeData", targetNamespace = "")
        boolean includeData
    ) throws SignServerException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeWorkerProperty", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveWorkerProperty")
    @ResponseWrapper(localName = "removeWorkerPropertyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveWorkerPropertyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeWorkerProperty(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "key", targetNamespace = "")
        java.lang.String key
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "addAuthorizedClient", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.AddAuthorizedClient")
    @ResponseWrapper(localName = "addAuthorizedClientResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.AddAuthorizedClientResponse")
    public void addAuthorizedClient(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "authClient", targetNamespace = "")
        org.signserver.adminws.AuthorizedClient authClient
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getWorkers", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetWorkers")
    @ResponseWrapper(localName = "getWorkersResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetWorkersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.Integer> getWorkers(

        @WebParam(name = "workerType", targetNamespace = "")
        int workerType
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "queryAuditLog", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryAuditLog")
    @ResponseWrapper(localName = "queryAuditLogResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryAuditLogResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.signserver.adminws.LogEntry> queryAuditLog(

        @WebParam(name = "startIndex", targetNamespace = "")
        int startIndex,
        @WebParam(name = "max", targetNamespace = "")
        int max,
        @WebParam(name = "condition", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryCondition> condition,
        @WebParam(name = "ordering", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryOrdering> ordering
    ) throws SignServerException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getSigningValidityNotBefore", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSigningValidityNotBefore")
    @ResponseWrapper(localName = "getSigningValidityNotBeforeResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSigningValidityNotBeforeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public javax.xml.datatype.XMLGregorianCalendar getSigningValidityNotBefore(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "importCertificateChain", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ImportCertificateChain")
    @ResponseWrapper(localName = "importCertificateChainResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ImportCertificateChainResponse")
    public void importCertificateChain(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "certificateChain", targetNamespace = "")
        java.util.List<byte[]> certificateChain,
        @WebParam(name = "alias", targetNamespace = "")
        java.lang.String alias,
        @WebParam(name = "authenticationCode", targetNamespace = "")
        java.lang.String authenticationCode
    ) throws OperationUnsupportedException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception, CertificateException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getSigningValidityNotAfter", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSigningValidityNotAfter")
    @ResponseWrapper(localName = "getSigningValidityNotAfterResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSigningValidityNotAfterResponse")
    @WebResult(name = "return", targetNamespace = "")
    public javax.xml.datatype.XMLGregorianCalendar getSigningValidityNotAfter(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "destroyKey", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.DestroyKey")
    @ResponseWrapper(localName = "destroyKeyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.DestroyKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean destroyKey(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "purpose", targetNamespace = "")
        int purpose
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getAuthorizedClients", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetAuthorizedClients")
    @ResponseWrapper(localName = "getAuthorizedClientsResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetAuthorizedClientsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.signserver.adminws.AuthorizedClient> getAuthorizedClients(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPKCS10CertificateRequestForAlias2", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForAlias2")
    @ResponseWrapper(localName = "getPKCS10CertificateRequestForAlias2Response", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForAlias2Response")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.CertReqData getPKCS10CertificateRequestForAlias2(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "certReqInfo", targetNamespace = "")
        org.signserver.adminws.Pkcs10CertReqInfo certReqInfo,
        @WebParam(name = "explicitEccParameters", targetNamespace = "")
        boolean explicitEccParameters,
        @WebParam(name = "keyAlias", targetNamespace = "")
        java.lang.String keyAlias
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getSignerCertificateChain", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSignerCertificateChain")
    @ResponseWrapper(localName = "getSignerCertificateChainResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSignerCertificateChainResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<byte[]> getSignerCertificateChain(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId
    ) throws AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPKCS10CertificateRequestForAlias", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForAlias")
    @ResponseWrapper(localName = "getPKCS10CertificateRequestForAliasResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForAliasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.Base64SignerCertReqData getPKCS10CertificateRequestForAlias(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "certReqInfo", targetNamespace = "")
        org.signserver.adminws.Pkcs10CertReqInfo certReqInfo,
        @WebParam(name = "explicitEccParameters", targetNamespace = "")
        boolean explicitEccParameters,
        @WebParam(name = "keyAlias", targetNamespace = "")
        java.lang.String keyAlias
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPKCS10CertificateRequestForKey", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForKey")
    @ResponseWrapper(localName = "getPKCS10CertificateRequestForKeyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.Base64SignerCertReqData getPKCS10CertificateRequestForKey(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "certReqInfo", targetNamespace = "")
        org.signserver.adminws.Pkcs10CertReqInfo certReqInfo,
        @WebParam(name = "explicitEccParameters", targetNamespace = "")
        boolean explicitEccParameters,
        @WebParam(name = "defaultKey", targetNamespace = "")
        boolean defaultKey
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "testKey", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.TestKey")
    @ResponseWrapper(localName = "testKeyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.TestKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.signserver.adminws.KeyTestResult> testKey(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "alias", targetNamespace = "")
        java.lang.String alias,
        @WebParam(name = "authCode", targetNamespace = "")
        java.lang.String authCode
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception, KeyStoreException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getWorkerId", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetWorkerId")
    @ResponseWrapper(localName = "getWorkerIdResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetWorkerIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int getWorkerId(

        @WebParam(name = "workerName", targetNamespace = "")
        java.lang.String workerName
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "queryTokenEntries", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryTokenEntries")
    @ResponseWrapper(localName = "queryTokenEntriesResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryTokenEntriesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.TokenSearchResults queryTokenEntries(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "startIndex", targetNamespace = "")
        int startIndex,
        @WebParam(name = "max", targetNamespace = "")
        int max,
        @WebParam(name = "condition", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryCondition> condition,
        @WebParam(name = "ordering", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryOrdering> ordering,
        @WebParam(name = "includeData", targetNamespace = "")
        boolean includeData
    ) throws OperationUnsupportedException_Exception, AdminNotAuthorizedException_Exception, InvalidWorkerIdException_Exception, SignServerException_Exception, AuthorizationDeniedException_Exception, CryptoTokenOfflineException_Exception, QueryException_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeKey", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveKey")
    @ResponseWrapper(localName = "removeKeyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeKey(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "alias", targetNamespace = "")
        java.lang.String alias
    ) throws InvalidWorkerIdException_Exception, SignServerException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception, KeyStoreException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getSignerCertificate", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSignerCertificate")
    @ResponseWrapper(localName = "getSignerCertificateResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetSignerCertificateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public byte[] getSignerCertificate(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId
    ) throws AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getGlobalConfiguration", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetGlobalConfiguration")
    @ResponseWrapper(localName = "getGlobalConfigurationResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetGlobalConfigurationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.WsGlobalConfiguration getGlobalConfiguration()
 throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "uploadSignerCertificateChain", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.UploadSignerCertificateChain")
    @ResponseWrapper(localName = "uploadSignerCertificateChainResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.UploadSignerCertificateChainResponse")
    public void uploadSignerCertificateChain(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "signerCerts", targetNamespace = "")
        java.util.List<byte[]> signerCerts,
        @WebParam(name = "scope", targetNamespace = "")
        java.lang.String scope
    ) throws IllegalRequestException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getCurrentWorkerConfig", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetCurrentWorkerConfig")
    @ResponseWrapper(localName = "getCurrentWorkerConfigResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetCurrentWorkerConfigResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.WsWorkerConfig getCurrentWorkerConfig(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeGlobalProperty", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveGlobalProperty")
    @ResponseWrapper(localName = "removeGlobalPropertyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveGlobalPropertyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeGlobalProperty(

        @WebParam(name = "scope", targetNamespace = "")
        java.lang.String scope,
        @WebParam(name = "key", targetNamespace = "")
        java.lang.String key
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "queryArchive", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryArchive")
    @ResponseWrapper(localName = "queryArchiveResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.QueryArchiveResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.signserver.adminws.ArchiveEntry> queryArchive(

        @WebParam(name = "startIndex", targetNamespace = "")
        int startIndex,
        @WebParam(name = "max", targetNamespace = "")
        int max,
        @WebParam(name = "condition", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryCondition> condition,
        @WebParam(name = "ordering", targetNamespace = "")
        java.util.List<org.signserver.adminws.QueryOrdering> ordering,
        @WebParam(name = "includeData", targetNamespace = "")
        boolean includeData
    ) throws SignServerException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "setGlobalProperty", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.SetGlobalProperty")
    @ResponseWrapper(localName = "setGlobalPropertyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.SetGlobalPropertyResponse")
    public void setGlobalProperty(

        @WebParam(name = "scope", targetNamespace = "")
        java.lang.String scope,
        @WebParam(name = "key", targetNamespace = "")
        java.lang.String key,
        @WebParam(name = "value", targetNamespace = "")
        java.lang.String value
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getKeyUsageCounterValue", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetKeyUsageCounterValue")
    @ResponseWrapper(localName = "getKeyUsageCounterValueResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetKeyUsageCounterValueResponse")
    @WebResult(name = "return", targetNamespace = "")
    public long getKeyUsageCounterValue(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "process", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ProcessResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<byte[]> process(

        @WebParam(name = "workerIdOrName", targetNamespace = "")
        java.lang.String workerIdOrName,
        @WebParam(name = "processRequest", targetNamespace = "")
        java.util.List<byte[]> processRequest
    ) throws IllegalRequestException_Exception, InvalidWorkerIdException_Exception, SignServerException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "globalReload", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GlobalReload")
    @ResponseWrapper(localName = "globalReloadResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GlobalReloadResponse")
    public void globalReload()
 throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPKCS10CertificateRequestForKey2", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForKey2")
    @ResponseWrapper(localName = "getPKCS10CertificateRequestForKey2Response", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestForKey2Response")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.CertReqData getPKCS10CertificateRequestForKey2(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "certReqInfo", targetNamespace = "")
        org.signserver.adminws.Pkcs10CertReqInfo certReqInfo,
        @WebParam(name = "explicitEccParameters", targetNamespace = "")
        boolean explicitEccParameters,
        @WebParam(name = "defaultKey", targetNamespace = "")
        boolean defaultKey
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "activateSigner", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ActivateSigner")
    @ResponseWrapper(localName = "activateSignerResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ActivateSignerResponse")
    public void activateSigner(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "authenticationCode", targetNamespace = "")
        java.lang.String authenticationCode
    ) throws InvalidWorkerIdException_Exception, CryptoTokenAuthenticationFailureException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeAuthorizedClient", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveAuthorizedClient")
    @ResponseWrapper(localName = "removeAuthorizedClientResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.RemoveAuthorizedClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeAuthorizedClient(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "authClient", targetNamespace = "")
        org.signserver.adminws.AuthorizedClient authClient
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "globalResync", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GlobalResync")
    @ResponseWrapper(localName = "globalResyncResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GlobalResyncResponse")
    public void globalResync()
 throws ResyncException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "generateSignerKey", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GenerateSignerKey")
    @ResponseWrapper(localName = "generateSignerKeyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GenerateSignerKeyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String generateSignerKey(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "keyAlgorithm", targetNamespace = "")
        java.lang.String keyAlgorithm,
        @WebParam(name = "keySpec", targetNamespace = "")
        java.lang.String keySpec,
        @WebParam(name = "alias", targetNamespace = "")
        java.lang.String alias,
        @WebParam(name = "authCode", targetNamespace = "")
        java.lang.String authCode
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getPKCS10CertificateRequest", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequest")
    @ResponseWrapper(localName = "getPKCS10CertificateRequestResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.GetPKCS10CertificateRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.signserver.adminws.Base64SignerCertReqData getPKCS10CertificateRequest(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "certReqInfo", targetNamespace = "")
        org.signserver.adminws.Pkcs10CertReqInfo certReqInfo,
        @WebParam(name = "explicitEccParameters", targetNamespace = "")
        boolean explicitEccParameters
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "setWorkerProperty", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.SetWorkerProperty")
    @ResponseWrapper(localName = "setWorkerPropertyResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.SetWorkerPropertyResponse")
    public void setWorkerProperty(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId,
        @WebParam(name = "key", targetNamespace = "")
        java.lang.String key,
        @WebParam(name = "value", targetNamespace = "")
        java.lang.String value
    ) throws AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "uploadSignerCertificate", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.UploadSignerCertificate")
    @ResponseWrapper(localName = "uploadSignerCertificateResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.UploadSignerCertificateResponse")
    public void uploadSignerCertificate(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId,
        @WebParam(name = "signerCert", targetNamespace = "")
        byte[] signerCert,
        @WebParam(name = "scope", targetNamespace = "")
        java.lang.String scope
    ) throws IllegalRequestException_Exception, AdminNotAuthorizedException_Exception;

    @WebMethod
    @RequestWrapper(localName = "deactivateSigner", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.DeactivateSigner")
    @ResponseWrapper(localName = "deactivateSignerResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.DeactivateSignerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean deactivateSigner(

        @WebParam(name = "signerId", targetNamespace = "")
        int signerId
    ) throws InvalidWorkerIdException_Exception, AdminNotAuthorizedException_Exception, CryptoTokenOfflineException_Exception;

    @WebMethod
    @RequestWrapper(localName = "reloadConfiguration", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ReloadConfiguration")
    @ResponseWrapper(localName = "reloadConfigurationResponse", targetNamespace = "http://adminws.signserver.org/", className = "org.signserver.adminws.ReloadConfigurationResponse")
    public void reloadConfiguration(

        @WebParam(name = "workerId", targetNamespace = "")
        int workerId
    ) throws AdminNotAuthorizedException_Exception;
}

package com.sf.integration.expressservice.service;

public class IExpressServiceProxy implements com.sf.integration.expressservice.service.IExpressService {
  private String _endpoint = null;
  private com.sf.integration.expressservice.service.IExpressService iExpressService = null;
  
  public IExpressServiceProxy() {
    _initIExpressServiceProxy();
  }
  
  public IExpressServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIExpressServiceProxy();
  }
  
  private void _initIExpressServiceProxy() {
    try {
      iExpressService = (new com.sf.integration.expressservice.service.CommonExpressServiceServiceLocator()).getCommonExpressServicePort();
      if (iExpressService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iExpressService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iExpressService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iExpressService != null)
      ((javax.xml.rpc.Stub)iExpressService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sf.integration.expressservice.service.IExpressService getIExpressService() {
    if (iExpressService == null)
      _initIExpressServiceProxy();
    return iExpressService;
  }
  
  public java.lang.String sfexpressService(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iExpressService == null)
      _initIExpressServiceProxy();
    return iExpressService.sfexpressService(arg0, arg1);
  }
  
  
}
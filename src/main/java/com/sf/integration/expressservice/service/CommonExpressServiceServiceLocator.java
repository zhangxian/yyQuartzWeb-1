/**
 * CommonExpressServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sf.integration.expressservice.service;

public class CommonExpressServiceServiceLocator extends org.apache.axis.client.Service implements com.sf.integration.expressservice.service.CommonExpressServiceService {

    public CommonExpressServiceServiceLocator() {
    }


    public CommonExpressServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommonExpressServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommonExpressServicePort
    private java.lang.String CommonExpressServicePort_address = "http://bsp-oisp.sf-express.com/bsp-oisp/ws/sfexpressService";

    public java.lang.String getCommonExpressServicePortAddress() {
        return CommonExpressServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommonExpressServicePortWSDDServiceName = "CommonExpressServicePort";

    public java.lang.String getCommonExpressServicePortWSDDServiceName() {
        return CommonExpressServicePortWSDDServiceName;
    }

    public void setCommonExpressServicePortWSDDServiceName(java.lang.String name) {
        CommonExpressServicePortWSDDServiceName = name;
    }

    public com.sf.integration.expressservice.service.IExpressService getCommonExpressServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommonExpressServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommonExpressServicePort(endpoint);
    }

    public com.sf.integration.expressservice.service.IExpressService getCommonExpressServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sf.integration.expressservice.service.CommonExpressServiceServiceSoapBindingStub _stub = new com.sf.integration.expressservice.service.CommonExpressServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCommonExpressServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommonExpressServicePortEndpointAddress(java.lang.String address) {
        CommonExpressServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sf.integration.expressservice.service.IExpressService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sf.integration.expressservice.service.CommonExpressServiceServiceSoapBindingStub _stub = new com.sf.integration.expressservice.service.CommonExpressServiceServiceSoapBindingStub(new java.net.URL(CommonExpressServicePort_address), this);
                _stub.setPortName(getCommonExpressServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommonExpressServicePort".equals(inputPortName)) {
            return getCommonExpressServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.expressservice.integration.sf.com/", "CommonExpressServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.expressservice.integration.sf.com/", "CommonExpressServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommonExpressServicePort".equals(portName)) {
            setCommonExpressServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * CommonExpressServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sf.integration.expressservice.service;

public interface CommonExpressServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCommonExpressServicePortAddress();

    public com.sf.integration.expressservice.service.IExpressService getCommonExpressServicePort() throws javax.xml.rpc.ServiceException;

    public com.sf.integration.expressservice.service.IExpressService getCommonExpressServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

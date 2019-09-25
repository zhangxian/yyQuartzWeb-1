

/**
 * CommonExpressServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package com.sf.integration.expressservice.service;

    /*
     *  CommonExpressServiceService java interface
     */

    public interface CommonExpressServiceService {
          

        /**
          * Auto generated method signature
          * 
                    * @param sfexpressService0
                
         */

         
                     public com.sf.integration.expressservice.service.SfexpressServiceResponseE sfexpressService(

                        com.sf.integration.expressservice.service.SfexpressServiceE sfexpressService0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sfexpressService0
            
          */
        public void startsfexpressService(

            com.sf.integration.expressservice.service.SfexpressServiceE sfexpressService0,

            final com.sf.integration.expressservice.service.CommonExpressServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
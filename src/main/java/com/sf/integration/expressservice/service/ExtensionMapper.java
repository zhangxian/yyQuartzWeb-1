
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */

        
            package com.sf.integration.expressservice.service;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://service.expressservice.integration.sf.com/".equals(namespaceURI) &&
                  "sfexpressService".equals(typeName)){
                   
                            return  com.sf.integration.expressservice.service.SfexpressService.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.expressservice.integration.sf.com/".equals(namespaceURI) &&
                  "sfexpressServiceResponse".equals(typeName)){
                   
                            return  com.sf.integration.expressservice.service.SfexpressServiceResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
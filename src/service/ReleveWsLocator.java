/**
 * ReleveWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class ReleveWsLocator extends org.apache.axis.client.Service implements service.ReleveWs {

    public ReleveWsLocator() {
    }


    public ReleveWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReleveWsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReleveServicePort
    private java.lang.String ReleveServicePort_address = "http://localhost:8888/";

    public java.lang.String getReleveServicePortAddress() {
        return ReleveServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReleveServicePortWSDDServiceName = "ReleveServicePort";

    public java.lang.String getReleveServicePortWSDDServiceName() {
        return ReleveServicePortWSDDServiceName;
    }

    public void setReleveServicePortWSDDServiceName(java.lang.String name) {
        ReleveServicePortWSDDServiceName = name;
    }

    public service.ReleveService getReleveServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReleveServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReleveServicePort(endpoint);
    }

    public service.ReleveService getReleveServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.ReleveServicePortBindingStub _stub = new service.ReleveServicePortBindingStub(portAddress, this);
            _stub.setPortName(getReleveServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReleveServicePortEndpointAddress(java.lang.String address) {
        ReleveServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.ReleveService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.ReleveServicePortBindingStub _stub = new service.ReleveServicePortBindingStub(new java.net.URL(ReleveServicePort_address), this);
                _stub.setPortName(getReleveServicePortWSDDServiceName());
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
        if ("ReleveServicePort".equals(inputPortName)) {
            return getReleveServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "releveWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "ReleveServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReleveServicePort".equals(portName)) {
            setReleveServicePortEndpointAddress(address);
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

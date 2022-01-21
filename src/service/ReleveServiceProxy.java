package service;

public class ReleveServiceProxy implements service.ReleveService {
  private String _endpoint = null;
  private service.ReleveService releveService = null;
  
  public ReleveServiceProxy() {
    _initReleveServiceProxy();
  }
  
  public ReleveServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initReleveServiceProxy();
  }
  
  private void _initReleveServiceProxy() {
    try {
      releveService = (new service.ReleveWsLocator()).getReleveServicePort();
      if (releveService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)releveService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)releveService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (releveService != null)
      ((javax.xml.rpc.Stub)releveService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.ReleveService getReleveService() {
    if (releveService == null)
      _initReleveServiceProxy();
    return releveService;
  }
  
  public service.Releve myReleve() throws java.rmi.RemoteException, service.JAXBException{
    if (releveService == null)
      _initReleveServiceProxy();
    return releveService.myReleve();
  }
  
  
}
package client;

import java.rmi.RemoteException;

import service.JAXBException;
import service.ReleveServiceProxy;

public class ReleveClient {

	public static void main(String[] args) throws JAXBException, RemoteException {
		
		ReleveServiceProxy proxy =new ReleveServiceProxy();
		
		
		System.out.println("RIB : "+proxy.myReleve().getRib());
		System.out.println("Date releve : "+proxy.myReleve().getDateReleve());
		System.out.println("Solde : "+proxy.myReleve().getSolde());
		System.out.println("Date debut des operations : "+proxy.myReleve().getDateDebut());
		System.out.println("Date Fin des operations : "+proxy.myReleve().getDateFin());
		System.out.println("Liste des operations : ");
		for(service.Operation op : proxy.myReleve().getListOperation()) {
			System.out.println(op);
		}

	}

}

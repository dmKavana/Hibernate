package HibernatePro;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//persistence cls is also called boot strap cls, it is used to converting JEE to JSE
public class ConnectionCre1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		System.out.println("Connected");

	}

}

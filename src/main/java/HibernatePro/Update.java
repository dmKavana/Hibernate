package HibernatePro;

import java.util.Scanner;

import javax.persistence.*;

public class Update 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		//In the persistence codedriver is registered and get the connection with DB
		System.out.println("Connection is established");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
//		One Method
		CreateTable ct=new CreateTable();
		ct.setId(11);
		ct.setName("Sakshi");
		ct.setAddress("Hasan");
		ct.setPhone(9951224567L);
		
//		Another Method
		CreateTable ct1=em.find(CreateTable.class, 22);
		ct1.setName("Drusti");
		ct1.setAddress("DVG");
		ct1.setPhone(9082263321L);
		
//		For update we use merge
		et.begin();
		em.merge(ct1);
		em.merge(ct);
		et.commit();
		System.out.println("Data is Updated");
		

	}

}

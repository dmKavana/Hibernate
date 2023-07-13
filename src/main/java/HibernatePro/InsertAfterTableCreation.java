package HibernatePro;

import javax.persistence.*;

public class InsertAfterTableCreation
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		System.out.println("Connection is established");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();//it is use for begin the transaction 
		
		CreateTable ct=new CreateTable();
		ct.setId(11);
		ct.setName("Keerthi");
		ct.setAddress("SKP");
		ct.setPhone(9876511210L);
				
		CreateTable ct1=new CreateTable();
		ct1.setId(22);
		ct1.setName("Lavya");
		ct1.setAddress("dvg1");
		ct1.setPhone(876566321L);
		
		CreateTable ct2=new CreateTable();
		ct2.setId(33);
		ct2.setName("Harsheetha");
		ct2.setAddress("SMG");
		ct2.setPhone(7234321190L);
		
		et.begin();
		em.persist(ct);
		em.persist(ct1);
		em.persist(ct2);
		et.commit();
		
		System.out.println("Data is inserted");

	}

}

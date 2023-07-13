package HibernatePro;

import javax.persistence.*;

public class Fetch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//		EntityTransaction is not used because Transaction is not happend in java appliaction side it is happened in DB.
		CreateTable ct=em.find(CreateTable.class, 33);
		System.out.println("Student_Id"+" "+ct.getId()+" "+"Name"+" "+ct.getName()+" "+"Address"+" "+ct.getAddress()+"  "+"Phone"+" "+ct.getPhone());

	}

}

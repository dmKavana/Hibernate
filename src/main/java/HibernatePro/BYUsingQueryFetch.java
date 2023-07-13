
package HibernatePro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BYUsingQueryFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();

		//student is the table of CreateTable class
		//
		Query qry=em.createQuery("select st from Student st" , CreateTable.class);
		List<CreateTable> lst=qry.getResultList();
		
		for(CreateTable st:lst)
		{
			System.out.println("Student_Id:"+st.getId()+" "+"Name"+" "+st.getName()+" "+"Adderss"+" "+st.getAddress()+" "+"Phone"+" "+st.getPhone());
		}
		
	}

}

package HibernatePro;

import javax.persistence.*;

@Entity(name="Student")	//annotation for rename the table_name we use @Entity(name="table_name")
//@Entity is used for for assign the table name
//This class template is a table structure,when we initialize the variables the it like table structure.
//object of the both table is same but address is different because both are related to same class
//annotation act as object itself

public class CreateTable 
{
		@Id //For declaring the primary key we use @Id annotation
		int id;
		 
		@Column(nullable=false) //For declaring the constraints we use @Column(Constriant_type=Boolean_value)
		String name;
		
		@Column(nullable=false)
		String address;
		
		@Column(nullable=false,unique=true)
		Long phone;
		
//		For setter and getter right click->option called source,->option called Generate getter and setter then select all click on generate
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public Long getPhone() {
				return phone;
			}

			public void setPhone(Long phone) {
				this.phone = phone;
			}


}

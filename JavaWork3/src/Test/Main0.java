package Test;
import org.omg.CORBA.PRIVATE_MEMBER;
public class Main0 {
	public class Person {
			private String name;
			private boolean gender;
			private int age;
			private int id;
			
			public Person(){
				System.out.println("This is constructor");
				System.out.println(name+","+age+","+gender+","+id);
			}

			public Person (String name,int age,boolean gender){
				setName(name);
				setAge(age);
				setGender(gender);
			}
			
			public String toString(){
				return "Person [name="+ name +", age=" + age +", gender=" + gender +", id=" + id + "]";
			}
			/*
			 *good 
			 */
			public String getName(){
				return name;
			}
			
			public void setName(String name){
				this.name = name;
			}
			
			public boolean getGender(){
				return gender;
			}
			
			public void setGender(boolean gender){
				this.gender = gender;
			}
			
			public int getAge(){
				return age;
			}
			
			public void setAge(int age){
				this.age = age;
			}
			
			public int getId(){
				return id;
			}
			
			public void setId(int id){
				this.id = id;
			}
	 
		}
		

	}

 

package Test;
import java.util.Arrays;
import java.util.Scanner;
public class Main0 {
	public static void main(String[] args) {
		int k=0,flag=1;
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		 PersonOverride person1[]=new PersonOverride[n1];
		 for (int i = 0; i < person1.length; i++) {
			 person1[i]=new PersonOverride();
		}
		 
		 int n2=in.nextInt();
		 PersonOverride person2[]=new PersonOverride[n2];
		 for (int i = 0; i < person2.length; i++) {
			 flag=1;
			 PersonOverride temp=new PersonOverride(in.next(),in.nextInt(),in.nextBoolean());
			 if( i == 0 )
				{
				person2[i] = temp;
				continue;
				}
				 for (int j = 0; j<i; j++){
					 if(person2[j]!=null)
					 if(temp.equals(person2[j]))
						 flag=0;  
				 }
				 if(flag==1){
					 person2[i]=temp;
				 }
			}
		 for (int i = 0; i < person1.length; i++) {
			 System.out.println(person1[i]);
		}
		 for (int i = 0; i<n2; i++) {
			 if(person2[i]!=null){
			 System.out.println(person2[i]);
			 k++;
			 }
		}
		 System.out.println(k);
			System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
		}	 
	} 
	class PersonOverride{
		private String name;
		private boolean gender;
		private int age;
		public PersonOverride(){
			this("default",1,true);
		}
		public PersonOverride(String name,int age,boolean gender){
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		public String toString() {
			return  name + "-" + age+"-"+gender  ;
		}
		public boolean equals(PersonOverride person) {
		 if(this.name.equals(person.name)&&this.age==person.age&&this.gender==person.gender)
			 return true;
		 else return false;
		} 
}



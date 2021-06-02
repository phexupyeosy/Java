package Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class PersonSortable2 {
	private String name;
    private int age;	    
    public PersonSortable2(String name,int age){
    	setName(name);
	   	setAge(age);
    }		    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public String toString(){
	   	return name + "-" + age;
    }
   /* 
    static Comparator<PersonSortable2> NameComparator = new Comparator<PersonSortable2>(){
		public int compare(PersonSortable2 o1, PersonSortable2 o2) {
			return o1.getName().compareTo(o2.getName());
		}
    };
    
    static Comparator<PersonSortable2> AgeComparator = new Comparator<PersonSortable2>(){
		public int compare(PersonSortable2 o1, PersonSortable2 o2) {
			return o1.getAge()-o2.getAge();
		}
    };*/
    static Comparator<PersonSortable2> NameComparator = (o1,o2)-> o1.getName().compareTo(o2.getName());
    static Comparator<PersonSortable2> AgeComparator = (o1,o2)-> o1.getAge()-o2.getAge(); 
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PersonSortable2[] per = new PersonSortable2[n];			
		for(int i = 0; i< n ;i++){
			per[i] = new PersonSortable2(in.next(),in.nextInt());
		}
		Arrays.sort(per,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		System.out.println("NameComparator:sort");
		for (int j = 0; j < n; j++) {
			System.out.println(per[j]);
		}
		Arrays.sort(per,(o1,o2)-> o1.getAge()-o2.getAge());
		System.out.println("AgeComparator:sort");
		for (int j = 0; j < n; j++) {
			System.out.println(per[j]);
		}
		System.out.println(Arrays.toString(NameComparator.getClass().getInterfaces()));
		System.out.println(Arrays.toString(AgeComparator.getClass().getInterfaces()));
		in.close();
	}
	
}

	


/*class NameComparator implements Comparator<PersonSortable2>{
	public int compare(PersonSortable2 p1, PersonSortable2 p2){
		return p1.getName().compareTo(p2.getName());
	}
}
class AgeComparator implements Comparator<PersonSortable2>{
	public int compare(PersonSortable2 p1, PersonSortable2 p2){
		return p1.getAge()-p2.getAge();
	}
}
*/






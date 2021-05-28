package Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main0 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PersonSortable2[] per = new PersonSortable2[n];			
		for(int i = 0; i< n ;i++){
			per[i] = new PersonSortable2(in.next(),in.nextInt());
		}
		
		Arrays.sort(per, new NameComparator());
		System.out.println("NameComparator:sort");
		for (int j = 0; j < n; j++) {
			System.out.println(per[j]);
		}
		Arrays.sort(per,new AgeComparator());
		System.out.println("AgeComparator:sort");
		for (int j = 0; j < n; j++) {
			System.out.println(per[j]);
		}
		System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
		System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
		in.close();
	}
}
class PersonSortable2 {
	private String name;
    private int age;	    
    public PersonSortable2(String name,int age){
    	super();
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
}		

class NameComparator implements Comparator<PersonSortable2>{
	@Override
	public int compare(PersonSortable2 p1, PersonSortable2 p2){
		return p1.getName().compareTo(p2.getName());
	}
}
class AgeComparator implements Comparator<PersonSortable2>{
	@Override
	public int compare(PersonSortable2 p1, PersonSortable2 p2){
		return p1.getAge()-p2.getAge();
	}
}






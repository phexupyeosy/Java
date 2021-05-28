package Test;
import java.util.Arrays;
import java.util.Scanner;
public class Main1{
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PersonSortable[] per = new PersonSortable[n];
		for(int i = 0; i< n ;i++){
			per[i] = new PersonSortable(in.next(),in.nextInt());
		}
		Arrays.sort(per);
		for (int j = 0; j < n; j++) {
		     System.out.println(per[j]);
		}
		System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
		in.close();
	}
}
 class PersonSortable implements Comparable<PersonSortable>{
    private String name;
    private int age;
    public PersonSortable(String name,int age){
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
    	return this.name + "-" + this.age;
    }
	@Override
	public int compareTo(PersonSortable p) {
		int pe = this.getName().compareTo(p.getName());
		if(pe != 0){
			return pe;
		}
		return this.getAge()-p.getAge();
		
	}	
}

	
	





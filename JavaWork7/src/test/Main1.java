package test;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main1 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Set<String> set = new TreeSet<String>();
	    while(in.hasNext()){
	    	String str = in.next();
	    	if(str.equals("!!!!!")) { break;}
	    	set.add(str);
	    }
	    System.out.println(set.size());
	    Iterator<String> i = set.iterator();
	    int sum = 0;
	    boolean flag = true;
		while (i.hasNext()==flag ) {
		    if (sum == 9) {
		    	flag = false;
		    }
		    sum += 1;
		    System.out.println(i.next());
	    }
	    in.close();
	}
}









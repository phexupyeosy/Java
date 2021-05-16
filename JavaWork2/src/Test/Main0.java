package Test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList List = new ArrayList();
		while (in.hasNext()) {
			String str = in.nextLine();
			int x = chose(str);
		    switch(x){
		        case 1:
		              int n = in.nextInt();
			          for(int i=1;i<=n;i++){
			    	      System.out.print(Fib(i)+" ");
		              }
				      String[] s = in.nextLine().split(" ");
			          int[] array = new int[s.length];break;
		        case 2:
		    	      List.removeAll(List);
		    	      String s1 = in.nextLine();
				      String[] arr = s1.split(" ");
		    	      for (int i = 0; i < arr.length; i++) {
		                  List.add(Integer.valueOf(arr[i]));
		              }
		              Collections.sort(List);
		              System.out.println(List);
		    	      break;
		        case 3:	
		    	      String a = in.nextLine();
		    	      int num = Integer.valueOf(a);
		    	      System.out.println(List.indexOf(num));
		    	      break;
		        case 4:
		        	  int n1=in.nextInt();
		    	      String[] ID = new String[18];
		    	      for (int i = 0; i < n1; i++) {
					      ID[i]=in.next();
				      }
		    	      for (int j = 0; j < ID.length; j++) {
		    		      System.out.println(ID[j].substring(6,10) + "-" + ID[j].substring(10,12) + "-" + ID[j].substring(12,14));
				      }
		        default:
		    	      System.out.println("exit");break;
		    }    
		}
    }

	public static int Fib(int n){
		int num = 0;
		if(n==1||n==2)  return 1;
		else  return Fib(n-1)+Fib(n-2);
	}

    public static void Search(char array[], char a){
    	for (int j = 0; j < array.length; j++) {
    		if(a != array[j])  System.out.println("-1");
    		if(a == array[j])  System.out.println(array[j]);
		}
    }
    
    public static int chose(String str) {
    	if(str.equals("fib")) return 1;
    	else if(str.equals("sort")) return 2;
    	else if(str.equals("search")) return 3;
    	else if(str.equals("getBirthDate")) return 4;
        return 0;
    }
}



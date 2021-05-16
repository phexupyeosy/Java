package Test;
import java.util.Scanner;
import java.util.Arrays;
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
    	String[] ID = new String[n];
    	for (int i = 0; i < n; i++) {
			ID[i]=in.next();
		}
    	String[] arr = new String[n];
    	while(in.hasNextLine()){
    		String str = in.nextLine();
			if(str.equals("sort1")){
		        for (int i = 0; i < n; i++) {
					    arr[i] = ID[i].substring(6,14); 
		        }
		        Arrays.sort(arr);
		        for (int i = 0; i < n; i++) {
		        	 System.out.println(arr[i].substring(0, 4)+"-"+arr[i].substring(4,6)+"-"+arr[i].substring(6,8));
				}
			}
		  if(str.equals("sort2")){
	        for (int i = 0; i < n; i++) {
				arr[i] = ID[i].substring(6,14);
			}
	        Arrays.sort(arr);
	        for (int i = 0; i < n; i++) {
	        	for (int j = 0; j < n; j++) {
					if(arr[i].equals(ID[j].substring(6, 14))){
						 System.out.println(ID[i]);break;
					}
			     }
		     }
    	  }
	     else {
		    System.out.println("exit");	
		}	 	
	}
    	
	}
    
}



package Test;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (Math.abs(a)<=1000 && Math.abs(b)<=1000) {
            	System.out.println(a + b);
			} 
            else {
            	System.out.println("a<=1000");
			}
            
        }
        
			
	
    }
}
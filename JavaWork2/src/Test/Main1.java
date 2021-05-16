package Test;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	StringBuilder string = new StringBuilder();
        	for (int i = 0; i < n; i++) {
				string.append(i);
			}
        	int x = in.nextInt();
        	int y = in.nextInt();
        	String a = string.substring(x,y);
        	System.out.println(a);
        }
	}
}

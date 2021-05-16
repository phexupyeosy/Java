package Test;
import java.util.Arrays;
import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	String[][] arry = new String[n][];
        	for (int i = 0; i < n; i++) {
				 arry[i] = new String[i+1];
				 for (int j = 1; j <= j+1; j++) {
					int result = (i+1)*j;
					String s = String.valueOf(result);
					String s1 = String.valueOf(i+1);
					String s2 = String.valueOf(j);
					arry[i][j-1] = s1+"*"+s2+"="+s;
					if(j==i+1){
						System.out.println(arry[i][j-1]);
					}
					else{
						String temp = String.format("%-7s", arry[i][j-1]);
						System.out.println(temp);
					}
				}
				System.out.println();
			}
        	String str = Arrays.deepToString(arry);
        	System.out.println(str);
        }
	}

}

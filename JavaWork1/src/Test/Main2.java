package Test;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
        while(str!=null)
        {
        	int sum=0;
        	char c[]=str.toCharArray();
        	 
        	for(int i=0;i<c.length;i++)
        	{
        		if(c[i]!='-' && c[i]!='.')
        		{
        			sum += c[i]-48;
        		}
        	} 
        	System.out.println(sum);
        	str=in.next();
        }

	}

}

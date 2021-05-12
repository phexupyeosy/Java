package Test;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
        while(str!=null)
        {
        	int[] numb = new int [str.length()+1];
    		int sum=0, nume=0;
        	int num = Integer.parseInt(str);//字符串转整数
		    if(num>=10000 && num<=20000)
		    {
		       System.out.print(Integer.toBinaryString(num) + ",");
	           System.out.print(Integer.toOctalString(num) + ",");
	           System.out.println(Integer.toHexString(num));//转二进制，八进制，十六进制
		     }
		    else
		    {
		    	if(num>=0){
			       for(int i=0;i<=str.length();i++)
			       {
				      numb[i] = num % 10;
				      num = num/10;
				      sum = sum+numb[i];
			        }
			       for(int j=str.length()-1;j>=0;j--)
			       {
			    	  System.out.print(numb[j] + " ");
			        }
			       System.out.println(sum);
		    	}
		    	else
		    	{
		    	   	nume=Math.abs(num);
		    	   	for(int i=0;i<=str.length();i++)
				       {
					      numb[i] = nume % 10;
					      nume = nume/10;
					      sum = sum+numb[i];
					   
				        }
				       for(int j=str.length()-2;j>=0;j--)
				       {
				    	  System.out.print(numb[j] + " ");
				        }
				       System.out.println(sum);
		    	  }
		     }str=in.next();
		}
		
	}

}

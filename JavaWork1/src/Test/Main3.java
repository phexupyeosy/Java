package Test;
import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		while(str!=null){
			int numb = 0;
			int num = Integer.parseInt(str);//������ַ���תΪ����
	        String strl = Integer.toBinaryString(num);//תΪ��������
	       if(num==0){
	    	   numb = 32;
	       }
	       if(num>0){
	           numb = 32-strl.length();
	       }
	       if(num<0){
		       numb = 0;
		   }
	        System.out.println(numb);
        	str=in.next();
		}
	}

}



package test;
import java.util.*;
public class Main2 {
	public static void main(String[] args){
		List<Character> arr = new ArrayList<Character>();
		List<Character> ar = new ArrayList<Character>();
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();	
			for (int i = 0; i < str.length()/2; i++) {
				arr.add(str.charAt(i)); //charAt����ָ������i��charֵ������ArrayList��
				ar.add(str.charAt(str.length()-i-1)); //����str����ArrayList��
			}
			boolean flag = true;
			for (int i = str.length()/2-1; i >= 0 ; i--) {
				if(arr.remove(i) != ar.remove(i)){
					flag = false;
				    break;
			    }//��arr�����ֵ��ar�Ĳ�һ��ʱ���false������ѭ���� �����ٱ���
			}
			System.out.println(flag);	
		}
	}
}
	 

	
	 


















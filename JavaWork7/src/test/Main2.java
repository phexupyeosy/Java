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
				arr.add(str.charAt(i)); //charAt返回指定索引i的char值，加入ArrayList中
				ar.add(str.charAt(str.length()-i-1)); //逆序将str加入ArrayList中
			}
			boolean flag = true;
			for (int i = str.length()/2-1; i >= 0 ; i--) {
				if(arr.remove(i) != ar.remove(i)){
					flag = false;
				    break;
			    }//当arr输出的值与ar的不一致时输出false并跳出循环， 不必再比了
			}
			System.out.println(flag);	
		}
	}
}
	 

	
	 


















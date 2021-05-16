package Test;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class Main6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = null;
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		while (!((str1=in.next()).indexOf("e")!=-1) && !(str1.indexOf("E")!=-1)) {
			BigInteger n=new BigInteger(str1);
			list.add(n);
		}
		BigInteger  result = new BigInteger("0");
		for(BigInteger i :list){
			result = result.add(i);
		}
		System.out.println(result);
	}
}


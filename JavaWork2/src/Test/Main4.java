package Test;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String a = in.nextLine();
			String b = in.nextLine();
			BigDecimal b1 = new BigDecimal(a);
			BigDecimal b2 = new BigDecimal(b);
			BigDecimal c = b1.add(b2);
			BigDecimal d = b1.multiply(b2);
			System.out.println(c);
			System.out.println(d);
		}	
    }
}

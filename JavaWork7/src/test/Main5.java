package test;
import java.util.*;
public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Queue<Integer> qa = new LinkedList<Integer>();
		Queue<Integer> qb = new LinkedList<Integer>();
		int n = in.nextInt();
		while(in.hasNext()){
			for (int i = 0; i < n; i++) {
				int c = in.nextInt();
				if(c%2 == 1) //通过奇偶数取余将顾客序列划分到两个队列去
					qa.add(c);
				else
					qb.add(c);
			}
			boolean flag = false;
			while(!qa.isEmpty()||!qb.isEmpty()) {
				if(!qa.isEmpty()){
					if(!flag) {
						System.out.print(qa.poll());
						flag=true;
					}
					else
						System.out.print(" "+qa.poll());
					if(!qa.isEmpty()){
						System.out.print(" "+qa.poll());
					}
				}	    	
				if(!qb.isEmpty()) {
					if(!flag) {
						System.out.print(" "+qb.poll());
						flag=true;
					}
					else
						System.out.print(" "+qb.poll());
				}
			}
		}
	}
}


















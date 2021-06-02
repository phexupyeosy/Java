package Test;
import java.util.Arrays;
import java.util.Scanner;
public class work3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		IntegerStack stack=new ArrayIntegerStack(n);
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			System.out.println(stack.push(sc.nextInt()));
		}
		System.out.println(stack.peek()+","+stack.empty()+","+stack.size());
		System.out.println(stack.toString());
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println(stack.pop());
		}
		System.out.println(stack.peek()+","+stack.empty()+","+stack.size());
		System.out.println(stack.toString());
	}

}
interface IntegerStack {
	public Integer push(Integer item);
	public Integer pop(); 
	public Integer peek(); 
	public boolean empty(); 
	public int size(); 
}
class ArrayIntegerStack implements IntegerStack {
	private Integer[] arr;
	private int top=0;
	public ArrayIntegerStack(int n) {
		arr=new Integer[n];
	}
	public Integer push(Integer item) {
		if(item==null)
		return null;
		if(top==arr.length)
			return null;
		arr[top++]=item;
			return item;
	}
	public Integer pop() {
		if(top==0)
			return null;
		return arr[--top];
	}
	public Integer peek() {
		if(top==0)
		return null;
		return arr[top-1];
		
	}
	public boolean empty() {
		if(top==0)
			return true;
		return false;
	}
	public int size() {
		return top;
	}
	public String toString() {
		return Arrays.toString(arr);
	}

}
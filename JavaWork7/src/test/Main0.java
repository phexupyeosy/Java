package test;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main0 {
	public static void main(String[] args) {
		IntegerStack arr = new ArrayListIntegerStack();
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			System.out.println(arr.push(in.nextInt()));
		}
		System.out.println(arr.peek() + "," + arr.empty() + "," + arr.size());
		System.out.println(arr);
		int x = in.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println(arr.pop());
		}
		System.out.println(arr.peek() + "," + arr.empty() + "," + arr.size());
		System.out.println(arr);
		in.close();
	}
}
interface IntegerStack{
	public Integer push(Integer item);//如item为null，则不入栈直接返回null。如栈满，也返回null.
	public Integer pop();//出栈，如为空，则返回null.
	public Integer peek();//获得栈顶元素，如为空，则返回null.
	public boolean empty();//如为空返回true
	public int size();
}
class ArrayListIntegerStack implements IntegerStack{		
	private List<Integer> list;
	public ArrayListIntegerStack() {
		list = new ArrayList<Integer>();
	}
	public Integer push(Integer item) {
		if(item == null){
			return null;
		}
		list.add(item);
		return item;
	}
	public Integer pop() {
		if(list.isEmpty()){
			return null;
		}
		return list.remove(list.size()-1);
	}
	public Integer peek() {
		if(list.isEmpty()){
			return null;
		}
		return list.get(list.size()-1);
	}
	public boolean empty() {
		return list.size()==0?true:false;
	}
	public int size() {
		return list.size();
	}
	public String toString(){
		return list.toString();	
	}
}
	

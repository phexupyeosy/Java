package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
	    while(in.hasNext()){
	    	String st = in.next();
	    	String[] str = st.split(" "); 
	    	for (int i = 0; i < str.length; i++) {
				String s = str[i];
				if(tm.containsKey(s)){
					int num = tm.get(s);
					tm.put(s, num+1);
				}
				else 
					tm.put(s, 1);
					tm.remove("!!!!!");
			}
	    	if(st.equals("!!!!!")) { break;}	
	    }
	    System.out.println(tm.size());
	    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
                tm.entrySet());      
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> left,
                    Map.Entry<String, Integer> right) {
                return (left.getValue()).compareTo(right.getValue());
            }
        };
        Collections.sort(list, comparator);
        int last = list.size() - 1;
        
        for (int i = last; i > last - 10; i--) {
            String key = list.get(i).getKey();
            Integer value = list.get(i).getValue();
            System.out.println(key + "=" + value);
        }
    }
}    
	    

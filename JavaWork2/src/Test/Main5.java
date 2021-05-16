package Test;
import java.util.*;
import java.util.Scanner;
enum Grade {A,B,C,D,E};
public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int score = in.nextInt();
			int x = 0;
			Grade a = getGrade(score);
			if(a == Grade.A)  x = 1;
			else if(a == Grade.B)  x = 2;
			else if(a == Grade.C)  x = 3;
			else if(a == Grade.D)  x = 4;
			else if(a == Grade.E)  x = 5;
			switch(x){
				case 1:System.out.println("Excellent");break;
				case 2:System.out.println("Good");break;
				case 3:System.out.println("Average");break;
				case 4:System.out.println("Fair");break;
				case 5:System.out.println("Poor");break;
				default:break;
			}
			printGradeInfo(a);
		}
	}
     private static Grade getGrade(int score){
    	 Grade b;
    	 if(score >= 90&&score <= 100) b = Grade.A;
    	 else if(score >= 80&&score <= 90) b = Grade.B;
    	 else if(score >= 70&&score <= 80) b = Grade.C;
    	 else if(score >= 60&&score <= 70) b = Grade.D;
    	 else b = Grade.E;
    	 return b;
     }
     public static void printGradeInfo(Grade grade){
    	 System.out.println("class name"+Grade.class);
    	 System.out.println("grade value="+grade);
     }
}

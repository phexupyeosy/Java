package Test;
import java.util.Arrays;
import java.util.Scanner;
import Main.ArrayUtils.PairResult;
public class work4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			double[] x = new double[n];
		    for (int i = 0; i < x.length; i++) {
				x[i] = in.nextDouble();
			}
			PairResult pr = ArrayUtils.findMinMax(x);
			System.out.println(pr);
			System.out.println(ArrayUtils.PairResult.class);
		}
	}
class ArrayUtils {
	static class PairResult {
		private double max;				
		private double min;
		public String toString(){
			return "PairResult [min="+ min + ", max=" + max +"]";
		}
	}
	public static PairResult findMinMax(double[] values){
		double[] y = values;
		Arrays.sort(y);
		PairResult pr = new PairResult();
		pr.min = y[0]; pr.max = y[y.length-1];
		return pr;
	}
}



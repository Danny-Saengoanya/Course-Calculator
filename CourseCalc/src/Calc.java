
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author Danny
 * 
 * Grade Calculator to find out what mark you need on your next assignment.
 *
 */
public class Calc {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Double> grade = new ArrayList<Double>();
	private ArrayList<Integer> weight = new ArrayList<Integer>();
	
	
	public static void main(String args[]) {
		Calc c = new Calc();
		c.askHowMuch();
		c.showGrade();
		
	}
	private void showGrade() {
		double total = 0;
		for(int i = 0; i != grade.size(); ++i) {
			System.out.println("Your grade for Assignment " + i + " is " + grade.get(i));
			total = total + grade.get(i);
		}
		System.out.println("Your Total mark is " + total + " out of 100");
		
	}
	public void askHowMuch() {
		System.out.println("How many assignments have you done\n ");
		int ammount = sc.nextInt();
		
		for(int i = 0; i != ammount; ++i) {
			System.out.println("What was the mark of your assignment?\n ");
			int a = sc.nextInt();
			System.out.println("What was the total mark of your assignment?\n ");
			int b = sc.nextInt();
			double ran = (double)a / (double)b;
				
			System.out.println("What was the weight of your assignment? ");
			int c = sc.nextInt();

			
			weight.add(c);			
			grade.add(ran*(double)c);
			
		}
		
	}
	
	public Double doMaths(double a, int b) {
		double ans = a*b;
		return ans;
	}
	
}


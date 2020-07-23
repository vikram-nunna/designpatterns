package designpatterns.behavioural_designpatterns;

import java.util.Scanner;



public class strat_dp {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter values of a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		
		calculate add = new calculate(new addition());		
	    add.calculate(a,b);
	    calculate divide = new calculate(new divison());		
	    divide.calculate(a,b);
	    calculate squareroot = new calculate(new square());		
	    squareroot.calculate(a,b);
	    
	    scan.close();
	}
}

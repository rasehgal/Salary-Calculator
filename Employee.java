import java.util.ArrayList;
import java.util.Scanner;


public abstract class Employee {
	Scanner in = new Scanner(System.in);
		public String empname;
		public double rate;
		public String Stat;
		public String Hrs;
		public double earnings;
		//used in calculations in diff classes
		
	
		public abstract double getPayAmt();
		public abstract String getStat();
		public abstract String getName();
		public abstract double getValue();
		public abstract String getHrs();
		
}

	
	
	
	
	


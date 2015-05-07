import java.util.Scanner;


public class Hourly extends Employee {
	Scanner in = new Scanner(System.in);
	 private String Stat;
     private String Name;
	 private double Value;
	 private String Hrs;
	 double rate;
	 double totalpay;
	 String empname;
	 int hours;
			
	 
	 
	 /**SALARY CALCULATIONS
		IF OVERTIME (+40) VS REG*/
		public double getPayAmt() {
			//get name from input
			System.out.println("Enter employee name:");
			empname = in.next();
			//get rate from input
			System.out.println("Enter hourly rate:");
			rate = in.nextDouble();
			
			//get hours from input
			System.out.println("Enter hours completed:");
			hours = in.nextInt();
			
			if ((hours > 40)) {
				totalpay = (40*rate)+((hours-40)*rate*2);
			} else {
				totalpay = hours*totalpay;
			}
			return totalpay;
		}
		
	 public void setStat(String s) {
			this.Stat = "Hourly";
		}
		
	 public String getStat() {
			return Stat;
		}
	 
	 public void setName(String s) {
		this.Name = empname;
	    }
		
	public String getName(){
		return Name;
		}
	
	public void setValue(double Value){
		this.Value = rate;
	}
	
	public double getValue() {
		return Value;
	}		
	
	public void setHrs(String Hrs) {
		this.Hrs = Integer.toString(hours);
	}
	
	public String getHrs() {
		return Hrs;
	}
	

	}



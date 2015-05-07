import java.util.Scanner;


public class CommissionBased extends Employee {
	Scanner in = new Scanner(System.in);
	 private String Stat;
     private String Name;
     private double Value;
     private String Hrs;
     double sales = Value;
	 double totalpay;
     String empname;

 		
 		
 		//salary = 500 + (0.1*sales)
 		public double getPayAmt() {
 			
 			//get name from input
 	 		System.out.println("Enter employee name:");
 	 		empname = in.next();
 	 		
 	 		//get sales from input
 	 		System.out.println("Total week's sales gain");
 	 		sales = in.nextDouble();
 	 		
 			totalpay = 500 + (0.1*sales);
 			return totalpay;
 		}
     
 		public void setStat(String s) {
			this.Stat = "Commissions Based";
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
			System.out.println("Enter total week's sales gain:");
			this.Value = in.nextDouble();
		}
		
		public double getValue() {
			return Value;
		}
		
		public void setHrs(String Hrs) {
			this.Hrs = "N/A";
		}
		
		public String getHrs() {
			return Hrs;
		}
		
		
		
		
	}



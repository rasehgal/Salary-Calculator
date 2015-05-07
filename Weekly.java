import java.util.Scanner;

public class Weekly extends Employee {
		Scanner in = new Scanner(System.in);
        private String Stat;
        private String Name;
        private double Value;
        private String Hrs;
        String empname;
        double rate;
        double totalpay;
		
      
      
		//REWARD
        @Override
		public double getPayAmt() {
			System.out.println("Enter employee name:");
			empname = in.next();
			System.out.println("Enter weekly rate:");
			rate = in.nextDouble();
			System.out.println("Would you like to reward this employee? (Y/N)");
			String rewardquery = in.next();
		
			//account for capitalizations
			switch(rewardquery) {
			case "Y": System.out.println("Calculating salary with 10% reward.");
						totalpay = (0.1*rate)+rate;
						return totalpay;
			case "y": System.out.println("Calculating salary with 10% reward.");
						totalpay = (0.1*rate)+rate;
						return totalpay;
			case "N": System.out.println("Calculating salary without 10% reward.");
						totalpay = rate;
						return totalpay;
			case "n": System.out.println("Calculating salary without 10% reward.");
						totalpay = rate;
						return totalpay;
			default:  System.out.println("Invalid input. Please respond (Y/N), case insensitive.");
						break;
						}
			return totalpay;
			}
		
		
		
		public void setStat(String s) {
			this.Stat = "Weekly";
		}
		
		@Override
		public String getStat() {
			return Stat;
		}
		
		public void setName(String s) {
			this.Name = empname;
		}
		
		@Override
		public String getName() {
			return Name;
		}
		
		public void setValue(double Value){
			this.Value = rate;
		}
		
		@Override
		public double getValue() {
			return Value;
		}
		
		public void setHrs(String Hrs) {
			this.Hrs = "N/A";
		}
		
		@Override
		public String getHrs() {
			return Hrs;
		}
		
	}



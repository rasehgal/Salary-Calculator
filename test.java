import java.util.ArrayList;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		//creates list of employees without setting limitations
		try (Scanner in = new Scanner(System.in)) {		
		ArrayList<Employee> employees = new ArrayList<Employee>();
				double PayAmt;
				String empname;
				Employee worker;
				//get type of employee for further calculations
				int i;
				System.out.println("Enter number of desired calculated employees");
				int num = in.nextInt();
				if (num < 0) {
					System.out.println("Invalid request. Please try again.");
				}
				for (i = 0; i < num; i++) {
					System.out.println("Enter type of employee (H, W, or CB):");
					String Stat = in.next();
					
					worker = null;
					//accounts for capitalizations
					switch (Stat) {
					case "H": 
						worker = new Hourly();
						break;
					case "h": 
						worker = new Hourly();
						break;
					case "W": 
						worker = new Weekly();
						break;
					case "w": 
						worker = new Weekly();
						break;
					case "CB": 
						worker = new CommissionBased();
						break;
					case "cb": 
						worker = new CommissionBased();
						break;
					default: //invalid input
						System.out.println("Invalid input. Please check spelling/case/etc. and try again.");
						break;
					}
					
					if (worker != null) {
						PayAmt = worker.getPayAmt();
						empname = worker.getName();
						employees.add(worker);
						System.out.println("Name     Status     Hours     Rate     Weekly Pay Amount");
						System.out.println("=========================================================");
						System.out.println(empname + "   " + worker.getStat() + "   " + worker.getHrs() + "   " + worker.getValue() + "   " + worker.getPayAmt());
					}
				}
		}
	}
}
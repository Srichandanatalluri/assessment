package Coding4;
import java.util.ArrayList;
public class Tester4 {

		public static void main(String[] args) {
			BussinessLogic4 be= new BussinessLogic4();
			ArrayList<Employee4> details=be.addDetails();
			be.processDetails(details);

		}


}

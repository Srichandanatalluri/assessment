package Coding4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class BussinessLogic4 {
ArrayList<Employee4> addDetails() {
       
		
        ArrayList<Employee4> details= new ArrayList<Employee4>();
        details.add(new Employee4(8001, "chandu",21, 100000f, "SSE"));
        details.add(new Employee4(8002, "puja",19, 75000f, "SE"));
        details.add(new Employee4(8003, "vincy",20, 50000f, "ASE"));
        details.add(new Employee4(8004, "nivetha",18, 40000f, "ASE"));
        details.add(new Employee4(8005, "janani",18, 60000f, "ASE"));        
        
        details.stream().forEach((i)->System.out.println(i));
        return details;
    }

    void processDetails(ArrayList<Employee4> details) {
    	System.out.println(":::::::Details After Sorting:::::::");
        
        List < Employee4 > EmployeeSortedList = details.stream()
                .sorted(Comparator.comparing(Employee4::getSalary))
                .collect(Collectors.toList());    

            EmployeeSortedList.forEach(i -> System.out.println(i));
    }

}

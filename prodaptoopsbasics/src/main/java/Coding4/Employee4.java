package Coding4;

public class Employee4 {
	int id;
	String name;
	int age;
	float salary;
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee4(int id, String name,int age,float salary,String designation) {
        super();
        this.id = id;
        this.name = name;
        this.age = age; 
        this.salary=salary;
        this.designation=designation;
    }
	public Employee4() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Employee [Employee id= " + id + ", Name= " + name + ", Age= "+age+", Salary="+salary+", Designation= "+designation+"]";
    }


}

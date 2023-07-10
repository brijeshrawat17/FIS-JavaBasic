package Activity;

public class HRManager extends Employee {
	public HRManager(int salary) {
		super(salary);
	}

	public void work() {
		System.out.println("Managing employees");
	}

	public void addEmployee() {
		System.out.println("Adding new employee!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(60000);
		HRManager mgr = new HRManager(1000000);

		emp.work();
		System.out.println("Employee salary: " + emp.getSalary());

		mgr.work();
		System.out.println("Manager salary: " + mgr.getSalary());
		mgr.addEmployee();

	}

}

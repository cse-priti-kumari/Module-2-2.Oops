class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;
	static {
		city = "Jalandhar";
		state = "Punjab";
		country = "India";
		branch = "Amritsar";
		department = "SoftwareDevelopment";
		comppany = "Capgemini";
	}
	SoftwareDeveloper
	(
		int id,String name, String mailId, long contactNumber, 
		String designation, double salary, String role, double incentive 
	){
		super(id, name, mailId, contactNumber);
		this.designation = designation;
		this.salary = salary;
		this.role = role;
		this.incentive  = incentive;
	}
	@Override
	public void reverseKT(){
		System.out.println("Explaination about latest SoftwareDevelopment tools and technologies");
	}
	@Override
	public void task(){
		System.out.println("SoftwareDevelopment");
	}
	@Override
	public void employeeInfor(){
		System.out.println("Employee Info");
		System.out.println("--------------");
		System.out.println("Id : "+super.id);
		System.out.println("Name : "+super.name);
		System.out.println("Designation : "+super.designation);
		System.out.println("Salary : "+super.salary);
		System.out.println();
	}
}
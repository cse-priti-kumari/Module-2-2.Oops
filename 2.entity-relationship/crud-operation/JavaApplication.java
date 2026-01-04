class JavaApplication(){
	public static void execution() {
		Student student =  new Student(1, "Rani","rani@gmail.com",9876543210l);
		student.displayStudentInfo();

		Project project = new Project(1,"E-Commerce","Java Based Web Application");

		//Student will Create a New Project
		student.createProject(project);

		//Student will read the existing project
		student.readProject();

		//Student will update the existing project
		student.updateProject(1,"Airline Reservatation System","Javascript Based Web Application");

		//Student will delete the existing Project
		student.deleteProject(1);
	}
}
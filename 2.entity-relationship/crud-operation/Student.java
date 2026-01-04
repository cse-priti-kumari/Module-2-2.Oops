class Student{
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	//Student HAS-A Project
	private Project project;
	public Student(){

	}
	publuc Student(int id, String name, String mailId, long contactNumber){
		this.id = id;
		this.name= name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getMailId(){
		return mailId;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public String getContactnumber(){
		return contactNumber;
	}
	public void setContactNumber(ong contactNumber){
		this.contactNumber=contactNumber;
	}
	public Project getProject(){
		return project;
	}
	public void setProject(Project project){
		this.project=project;
	}
	public void displayStudentInfo(){
		System.out.println("Student Info");
		System.out.println("-------------");
		System.out.println("Id : "+getId());
		System.out.println("Name : "+getName());
		System.out.println("Mail Id :"+getMailId());
		System.out.println("Contact NUumber : "+getContactnumber());
		System.out.println();
	}
	public void createProject(Project project){
		if(this.project ==  null && projecy !=null){
			setProject(project);
			System.out.println("Project Created!");
		}
		else{
			System.out.println("Project Not Created!");
		}
	}
	public void readProject(){
		if(this.getProject()!=null){
			this.getProject().displayProjectInfo();
			System.out.println("Project Displayed!");
		}
		else{
			System.out.println("Project Not Displayed!");
		}
	}
	public void updateProject(int id, String name, String description){
		if(id>0 && name!=null && description!=null){
			if(this.getProject().getId()==id){
				this.getProject().setName(name);
				this.getProject().setDescription(description);
				System.out.println("Project Updated");
			}
			else{
				System.out.println("Project Not Updated");
			}
		}
		else{
			System.out.println("Invalid Data!");
		}
	}
	public void deleteProject(int id){
		if(id>0){
			if(this.getProject().getId ==id){
				this.setProject(null);
				System.out.println("Project Deleted!");
			}
			else{
				System.out.println("Project Not Deleted!");
			}
		}
		else{
			System.out.println("Invalid Data!");
		}
	}
}
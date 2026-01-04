class Oracle exetned Database {
	public void displayOracleDBInfo() {
		System.out.println("Oracle DB Info");
		System.out.println("---------------");
		System.out.println("URL : "+url);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println();
	}
	public void crudOperation(){
		System.out.println("System Generated Queries! ");
	}
}
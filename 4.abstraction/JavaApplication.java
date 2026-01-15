class JavaApplication {
	public static void execution(){
		// Punjab punjab = new Punjab();
		// punjab.regionalLanguage();

		// Karnataka karnataka = new Karnataka();
		// karnataka.regionalLanguage();

		// SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(
		// 	1, "Rani","rani@gmail.com",9876543210l,"Associate Software Engineer",96969696.9696,"Java Developer",63636363.636);
		// softwareDeveloper.employeeInfo();
		// softwareDeveloper.entry();
		// softwareDeveloper.login();
		// softwareDeveloper.meeting();
		// softwareDeveloper.reverseKT();
		// softwareDeveloper.task();
		// softwareDeveloper.logout();
		// softwareDeveloper.exit();

		System.out.println(SuperInterface.c);
		SuperInterface.sm();

		System.out.println();
		System.out.println(SubConcreteClass.c);

		SubConcreteClass subConcreteClass =  new SubConcreteClass();
		subConcreteClass.nsm();
	}
} 
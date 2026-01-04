class JavaApplication {
	public static void execution() {
		Student s = new Student();
		//indirect read operation- unsafe
		System.out.println(s.getId());
		System.out.println(s.getName());
		//indirect write operation- safe
		s.setId(1);
		s.setName("Raja");
		//indirect write operation- safe
		System.out.println(s.getId());
		System.out.println(s.getName());

	}
}
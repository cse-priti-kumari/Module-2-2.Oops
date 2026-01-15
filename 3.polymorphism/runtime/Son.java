class Son extends Father{
	// @Override
	// public void career() {
	// 	System.out.println("Future Doctor");
	// }
	// @Override
	// public void marraige() {
	// 	System.out.println("Love Marraige");
	// }

	@Override
	public ScientificCalculator buyCalculator(){
		return new ScientificCalculator();
	}
}
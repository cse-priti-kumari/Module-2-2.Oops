class JavaApplication {
	public static void execution() {
		Orcale oracle = new Oracle();
		oracle.url = "www.oracldb.com";
		oracle.username = "raja";
		oracle.password = "raja@143";
		oracle.displayPOracleDBInfo();
		oracle.connection();
		oracle.crudOperation();
		oracle.disconnection();

		MySQL mySQL = new MySQL();
		mySQL.url = "www.mySQLdb.com";
		mySQL.username = "rani";
		mySQL.password = "rani@143";
		mySQL.displayPOracleDBInfo();
		mySQL.connection();
		mySQL.crudOperation();
		mySQL.disconnection();
	}
}
class Instagram {
	public String username;
	public String password;
	public String mailId;
	public String captcha;
	public long contactNumber;
	public int otp;
	public void login(String usernmae, String password){
		this.username = username;
		this.password = password;
		System.out.println("Instagram Log In Successful!");
	}
	public void login(SAtring username, String password, String captcha){
		this.username = username;
		this.password = password;
		this.captcha=captcha;
		System.out.println("Instagram Log In Successful!");
	}
	public void login(String mailId, int otp){
		this.mailId=mailId;
		this.otp=otp;
		System.out.println("Instagram Log In Successful!");
	}
	public void login(String contactNumber, int otp){
		this.contactNumber=contactNumber;
		this.otp=otp;
		System.out.println("Instagram Log In Successful!");
	}
}
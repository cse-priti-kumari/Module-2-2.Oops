class MediaPlayer {
	private String brand;
	private String make;
	private double price;
	public MediaPlayer(String brand, String make, double price){
		this.brand=brand;
		this.make=make;
		this.price=price;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make= make;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void displayMediaPlayerInfo(){
		System.out.println("MediaPlayer Details");
		System.out.println("-------------------");
		System.out.println("Brand : "+getBrand());
		System.out.println("Make : "+getMake());
		System.out.println("Price : "+getPrice);
		System.out.println();
	}
}
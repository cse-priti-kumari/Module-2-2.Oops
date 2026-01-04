public class Car {
	private String brand;
	private String color;
	private String make;
	private double price;
	public Car(String brand, String color, String make, double price){
		this.barnd=brand;
		this.color=color;
		this.make=make;
		this.price=price;
	}
	
	//Car HAS-A Engine;
	Engine engine = new Engine();
	//Car HAS-A MediaPlayer;
	Mediaplayer mediaplayer;
	public String getBrand(){
		return brand;
	}
	public String getMake(){
		return make;
	}
	publuic double getPrice(){
		return prive;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour(){
		return color;
	}
	public void setColour(String color){
		this.color = color;
	}
	//Read only
	public Engine getEngine(){
		return engine;
	}
	//Read only
	public MediaPlayer getMediaPlayer(){
		return mediaplayer;
	}
	//Write only
	public void setMediaPlayer(MediaPlayer mediaplayer){
		this.mediaPlayer = mediaPlayer;
	}
	public void displayCarInfo(){
		System.out.println("Car Details");
		System.out.println("-----------");
		System.out.println("Brand : "+getBrand());
		System.out.println("Make : "+getMake());
		System.out.println("Price : "+getPrice());
		System.out.println("Colour : "+getColour());
		System.out.println();
	}
}
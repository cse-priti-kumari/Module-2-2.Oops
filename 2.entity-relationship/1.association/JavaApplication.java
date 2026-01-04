class JavaApplication {
	public static void execution() {
		Engine engine = new Engine(1200,4,1000);

		MediaPlayer mediaPlayer = new MediaPlayer("Boat", "India", 6547373.73433);

		//Dependency Injection - constructor
		Car car = new Car("Hyundai - Creta", "Crimson", "India",96786678.788);
		car.displayCarInfo();
		car.getEngine().dispplayEngineInfo();
		
		//Dependency Injection - setter Method
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerInfo();
	}
}
package chapter11;

public class MP3Test {
	
	public static void main(String[] args) {
		MyMP3 mp3 = new TonyMP3();
		mp3.listenFM();
		mp3.playMP3();
		mp3.viewPhoto();
		
		MyMP3 mp31 = new BppleMP3();
		mp31.listenFM();
		mp31.playMP3();
		mp31.viewPhoto();
	}

}

package pk.cui.facade;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VideoConversionFacade converter = new VideoConversionFacade();
	        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	        
	}

}

package org.javaopencvbook;

import org.javaopencvbook.util.ImageViewer;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
public class App 
{
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

	public static void main(String[] args) throws Exception {
		String filePath = "src/main/resources/images/cathedral.jpg";
		Mat newImage = Imgcodecs.imread(filePath);
		
		if(newImage.dataAddr()==0){
			System.out.println("Couldn't open file " + filePath);
		}else{
			ImageViewer imageViewer = new ImageViewer();
			imageViewer.show(newImage, "Loaded image");
		}

	}
}
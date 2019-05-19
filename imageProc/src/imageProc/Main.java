package imageProc;
//import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import java.awt.BorderLayout;

import javax.swing.*;
public class Main {
		public Main()
		{
			Mat image = Imgcodecs.imread("a.jpg");
		  	  Mat gray = new Mat();
			Imgproc.cvtColor(image, gray, Imgproc.COLOR_BGR2GRAY);
		  	  Imgcodecs.imwrite("gray.jpg", gray);		
		}
public static void main(String [] args)
{
	Main obj = new Main();
	obj.func();
	
}
public void func()
{
JFrame frame = new JFrame("my frame");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 300);
frame.setVisible(true);
Image img = new Image();
frame.getContentPane().add(BorderLayout.CENTER, img);
}
}
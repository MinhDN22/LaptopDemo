package mainPackage;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();

		// Camera methods
		laptop.camera.takePhoto();
		laptop.camera.deletePhoto();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter zoom level: ");
		laptop.camera.setZoomLevel(scanner.nextDouble());
		System.out.println(laptop.camera.getZoomLevel());
		scanner.close();

		// SoundSpeaker methods
		laptop.soundSpeaker.volumeUp();
		laptop.soundSpeaker.volumeDown();
	}

}

package mainPackage;

public class Camera {
	private double zoomLevel;

	public void takePhoto() {
		System.out.println("Photo taken!");
	}

	public void deletePhoto() {
		System.out.println("Photo deleted!");
	}

	public double getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(double zoomLevel) {
		if (zoomLevel < 0 || zoomLevel > 10) {
			throw new IllegalArgumentException("zoomLevel must be between 0 and 10.");
		}
		this.zoomLevel = zoomLevel;
	}

}

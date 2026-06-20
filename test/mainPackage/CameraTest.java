package mainPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CameraTest {

	private Camera camera;

	@BeforeEach
	void setUp() {
		camera = new Camera();
	}

	@Test
	void setZoomLevel_acceptsMinBoundary() {
		camera.setZoomLevel(0);
		assertEquals(0, camera.getZoomLevel());
	}

	@Test
	void setZoomLevel_acceptsMaxBoundary() {
		camera.setZoomLevel(10);
		assertEquals(10, camera.getZoomLevel());
	}

	@Test
	void setZoomLevel_acceptsValidDoubleInRange() {
		camera.setZoomLevel(5.5);
		assertEquals(5.5, camera.getZoomLevel());
	}

	@Test
	void setZoomLevel_rejectsNegativeValue() {
		assertThrows(IllegalArgumentException.class, () -> camera.setZoomLevel(-0.1));
	}

	@Test
	void setZoomLevel_rejectsValueAbove10() {
		assertThrows(IllegalArgumentException.class, () -> camera.setZoomLevel(10.1));
	}

	@Test
	void setZoomLevel_rejectsNaN() {
		assertThrows(IllegalArgumentException.class, () -> camera.setZoomLevel(Double.NaN));
	}

	@Test
	void setZoomLevel_rejectsPositiveInfinity() {
		assertThrows(IllegalArgumentException.class, () -> camera.setZoomLevel(Double.POSITIVE_INFINITY));
	}

	@Test
	void setZoomLevel_rejectsNegativeInfinity() {
		assertThrows(IllegalArgumentException.class, () -> camera.setZoomLevel(Double.NEGATIVE_INFINITY));
	}
}

package Builder;

import java.util.List;

public class CameraType {
	

	String name;
	List<String> parts;
	public void addParts(List<String> parts) {
		this.parts = parts;
	}
	void CameraFeatures() {
		System.out.println("Features of  " + name);
		for(String part: parts) {
			System.out.println("   " + part);
		}
	}

	void focusingScreen() {
		System.out.println("A camera’s Focusing Screen is the glass surface on which the camera’s mirror projects the image. The focusing screen helps in achieving various focus effects such as sharp and high-contrast shots to blurs and bokeh");
	}
	void Shutter() {
		System.out.println("The shutter is an opaque piece of metal or plastic that controls the amount of light that reaches the camera sensor. ");
		
	}
	void Display() {
		System.out.println("The camera display shows the user helpful information about the photos and the camera. Here you will see the different camera settings you can tweak to alter your exposure, ISO, shutter speed, and more.\n");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----\n");
		for(String part : parts) {
			display.append(part + "\n");
		}
		return display.toString();
	}
	

}

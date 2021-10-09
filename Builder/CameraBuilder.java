package Builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CameraBuilder {
	String name;
	List<String> parts = new ArrayList<String>();
	
	public abstract CameraBuilder addLens();
	public abstract CameraBuilder addBatteries();
	public abstract CameraBuilder addFlash();
	public abstract CameraBuilder addModeDials();
	public abstract CameraBuilder addAperture();
	public abstract CameraBuilder addPeriscope();
	
	
	public CameraType build() {
		CameraType type = new CameraType();

		type.setName(this.name);
		type.addParts(parts);
		return type;
	

}
}

package Builder;

public class DslrCameraBuilder extends CameraBuilder{
	public DslrCameraBuilder() {
		this.name = "Dslr Camera";
	}

	@Override
	public CameraBuilder addLens() {
		this.parts.add("Lens");
		return this;
	}

	@Override
	public CameraBuilder addBatteries() {
		this.parts.add("Batteries");
		return this;
	}

	@Override
	public CameraBuilder addFlash() {
		this.parts.add("Flash");
		return this;
	}

	@Override
	public CameraBuilder addModeDials() {
		this.parts.add("Modes");
		return this;
	}

	@Override
	public CameraBuilder addAperture() {
		this.parts.add("Aperture");
		return this;
	}

	@Override
	public CameraBuilder addPeriscope() {
		this.parts.add("Periscope");
		return this;
	}

}

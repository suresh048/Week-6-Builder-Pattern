package Builder;

public class NewCameraState implements State {
	
	CameraStates cameraStates;
	
	public NewCameraState(CameraStates cameraStates) {
		this.cameraStates=cameraStates;
	}

	@Override
	public void Selfie() {
		System.out.println("Camera is in Selfie,Take a Selfie");
		cameraStates.setState(cameraStates.getPotraitState());
	}

	@Override
	public void Panaroma() {
		System.out.println("Camera is in Panaroma,Take a picture of your total surroundings");
		cameraStates.setState(cameraStates.getWideAngleState());
	}

	@Override
	public void WideAngle() {
		System.out.println("Camera is in Wide Angle Mode, Take a picture with wide mode");
		
	}



	@Override
	public void NewCamera() {
		System.out.println("Prepare a New Camera  with selected hardware. ");
		CameraBuilder builder=new MobilePhoneCameraBuilder();
		CameraType type=builder.addAperture().addBatteries().addFlash().addLens().addModeDials().addPeriscope().build();
		type.CameraFeatures();
		type.focusingScreen();
		type.Display();
		System.out.println(type);
		
		builder=new DslrCameraBuilder();
		type=builder.addAperture().addBatteries().addFlash().addLens().addModeDials().addPeriscope().build();
		type.CameraFeatures();
		type.focusingScreen();
		type.Display();
		System.out.println(type);

		
	}

	@Override
	public void Potrait() {
		System.out.println("Camera is in Potrait, Take a picture with background blur.");

	}
	public String toString() {
		return " New Camera State";
	}

}

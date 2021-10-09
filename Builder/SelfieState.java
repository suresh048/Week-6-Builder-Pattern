package Builder;

public class SelfieState implements State {

	CameraStates cameraStates;
	public SelfieState(CameraStates cameraStates) {
		this.cameraStates=cameraStates;
		
	}
	@Override
	public void Selfie() {
		System.out.println("Camera is in Selfie,Take a Selfie");
		
	}

	@Override
	public void Panaroma() {
		System.out.println("Camera is in Panaroma,Take a picture of your total surroundings");

	}

	@Override
	public void WideAngle() {
		System.out.println("Camera is in Wide Angle Mode, Take a picture with wide mode");
		
	}


	@Override
	public void NewCamera() {
		System.out.println("Prepare a New Camera  with selected hardware. ");
		
	}

	@Override
	public void Potrait() {
		System.out.println("Camera is in Potrait, Take a picture with background blur.");
		
	}
	public String toString() {
		return " Selfie Mode";
	}

}

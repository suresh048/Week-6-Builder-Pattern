package Builder;

public class CameraStates {

	State selfieState;
	State wideAngleState;
	State panaromaState;
	State potraitState;
	State newCameraState;
	State state;


	public CameraStates() {
		selfieState = new SelfieState(this);
		wideAngleState = new WideAngleState(this);
		panaromaState = new PanaromaState(this);
		potraitState = new PotraitState(this);
		newCameraState = new NewCameraState(this);

		state = newCameraState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	public State getNewCameraState() {
		return newCameraState;
	}
	public State getSelfieState() {
		return selfieState;
	}
	public State getWideAngleState() {
		return wideAngleState;
	}
	public State getPanaromaState() {
		return panaromaState;
	}
	public State getPotraitState() {
		return potraitState;
	}
	public void Selfie() {
		state.Selfie();
	}
	public void Panaroma() {
		state.Panaroma();
	}
	public void Potrait() {
		state.Potrait();
	}
	public void WideAngle() {
		state.WideAngle();
	}
	public void NewCamera() {
		state.NewCamera();
	}
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("Camera Started .... ");
		result.append("Camera is " + state + "\n");

		return result.toString();
	}

}



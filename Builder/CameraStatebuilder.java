package Builder;

public class CameraStatebuilder {
	public static void main(String []args) {
		
		CameraStates cameraStates=new CameraStates();
		cameraStates.NewCamera();

		cameraStates.Panaroma();
		cameraStates.Potrait();
		System.out.println(cameraStates);
		cameraStates.WideAngle();
		cameraStates.NewCamera();

		System.out.println(cameraStates);
		

	}

}

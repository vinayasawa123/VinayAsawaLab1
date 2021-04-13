/**
 * 
 */
package edu.fiu.lab3;

/**
 * @author 18135
 *
 */
public class Mast_Cam extends Camera {
  
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "mast_cam";
	}

	public void Move_Cam_Axis() {
		// TODO Auto-generated method stub
		System.out.println("Axis Fixed");
	}

	public void ThreeD_Picture() {
		// TODO Auto-generated method stub
		System.out.println("Clicked picture");
	}

	public void Store_Picture() {
		// TODO Auto-generated method stub
		
		Memory mymemory =  new Memory();
		mymemory.Save_image();
     	System.out.println("ImageStored");
	}

	
}

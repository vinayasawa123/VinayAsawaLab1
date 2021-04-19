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
		// moves the cam axis
		
		System.out.println("Axis Fixed");
		
	}

	public void ThreeD_Picture() {
		// TODO Auto-generated method stub
		//take 3d pictures
		
		System.out.println("Clicked picture");
	}

	public void Store_Picture() {
		// TODO Auto-generated method stub
		// staores the pic for that call the memory address fn
		
		
		Memory mymemory =  new Memory();
		mymemory.Save_image();
     	System.out.println("ImageStored");
	}

	
}

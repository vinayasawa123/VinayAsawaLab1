/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author 18135
 *
 */
public class camera implements SelfCheckCapable {
String lens;
int obstacle_locator;

/**
 * string lens give names of the lens used
 * int obstacle_locator gives position of obstable
 */

void take_picture()
{
	/**
	 * take picture or a photo
	 */
}

rover store_picture()
{
	return null;
  /**
   * stores the picture taken	
   */
}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "image stored";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
		/**
		 * Random check to check if camera fails to store image 0.1 times
		 */
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
	

}


class cache_cam extends camera
{
  int top_view;
  void microscopic_picture()
  {
  }
  void top_of_sample_view()
  {
  } 
  
  /**
   * this is child class cache_cam which gives top view of microscopic objects
   * and has methods microscopic_picture which take pictures at microscopic level
   * and gives top view of samples tested
   */
}

class mast_cam extends camera
{
  int science_cam;
  void threeD_picture()
  {
  }
  void zoom_lens()
  {
  } 
  void color_image()
  {
  }
 /** this is child class mast_cam with attribute science_cam
  * and has methods like zooms lens, 3d picture, and gives color image
  * and inherits main class camera
  */
}

class haz_cam extends camera
{
  int front_cam;
int   rear_cam;
  
  void arm_movement()
  {
  }
  void hazard_cam()
  {
  } 
  void three_D_view()
  {
  }
 /** this is child class haz-cam with attribute like front_cam and rear_cam
  * and has methods like arm-movement, helps in hazard detection and give 3 d view
  * and inherits main class camea
  */
}

class nav_cam extends camera
{
  int left_cam;
int  right_cam;
  
  void obstacle_check()
  {
  }
  void blind_drive_check()
  {
  } 

 /** this is child class nav_cam with attribute like left and right camera
  * and has methods like obstacle checking and blind drive movement
  * and inherits main class camera
  */
}





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
public class Wheel implements SelfCheckCapable {
	int diameter;
	int grip;
	int suspension;
	/**
	 * int diameter, int grip , int suspension are 
	 * values of each respectively 
	 * @return
	 */
	
	rover movement()
	{
		return null;
		/**
		 * this method tracks rovers movement
		 */
	}

	void brake()
	{
		/**
		 * this method is used to stop the rover
		 */
	}
	
	
	void wheelaxis_check()
	{
		/**
		 * this method is used to check the wheel axis alignment
		 */
	}
	
	void wheelaxis_rotation()
	{
		/**
		 * this method is used to rotate the wheel to align them
		 */
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Wheel";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
		/**
		 * random check to see if wheel fails move 0.5 times
		 */
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
}

class front extends Wheel
{
  int distance;	  
  void  move_front()
  {
  }

 /** this is child class front  with attribute distance
  * and has methods like move_front which with distance helps in moving forward
  * and inherits main class wheel
  */
}

class back extends Wheel
{
  int distance;	  
  void  move_back()
  {
  }

 /** this is child class back  with attribute distance
  * and has methods like move_back which with distance helps in moving backward
  * and inherits main class wheel
  */
}

class left extends Wheel
{
  int distance;	  
  void  move_left()
  {
  }

 /** this is child class left  with attribute distance
  * and has methods like move_left which with distance helps in moving left
  * and inherits main class wheel
  */
}

class right extends Wheel
{
  int distance;	  
  void  move_right()
  {
  }

 /** this is child class right  with attribute distance
  * and has methods like move_right which with distance helps in moving right
  * and inherits main class wheel
  */
}

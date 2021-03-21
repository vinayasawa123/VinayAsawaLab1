/**
 * 
 */
package edu.fiu.lab1;



/**
 * @author 18135
 *
 */
public class rover {
	
	int arm;
	int body;
	int brain;
	int temperature_control; 
	int neck;
	
	/** 
	 * int arm is length of arm
	 * int body is length of body
	 * int brain is processing speed of brain of brain
	 * int temperature_control is to give out outside temperature control
	 * int neck is height of neck
	 */
	
void move()
{
	/**
	 * this method is used to move the rover
	 */
}

void collect_sample()
{
	/**
	 * this method is used to clooect the samples 
	 */
}

void temperature_check()
{
	/**
	 * this method is used to check the outside temperature
	 */
}

void process_info()
{
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        remotecontrol myremotecontrol = new remotecontrol();
        myremotecontrol.runSelfCheck();
       /**
        * here we are creating an object for class remotecontrol 
        * and running the selfcheck method
        */
        
        Wheel myWheel = new Wheel();
        myWheel.runSelfCheck(); 
        /**
         * here we are creating an object for class Wheel
         * and running the selfcheck method.
         */
        
        power_source mypower_soruce = new power_source() ;
        mypower_soruce.runSelfCheck();
        /**
         * here we are creating an object for class power_source
         * and running the selfcheck method.
         */
        
        camera mycamera = new camera();
        mycamera.runSelfCheck();
        /**
         * here we are creating an object for class camera
         * and running the selfcheck method.
         */
        
        
        
	}

}

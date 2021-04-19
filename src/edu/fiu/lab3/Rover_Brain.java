/**
 * 
 */
package edu.fiu.lab3;



import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author 18135
 *
 */
public class Rover_Brain implements SelfCheckCapable {
	
    Memory mymemory;
    Antenna myantenna;
    UHFA myuhfa;
    Mast_Cam mymc;
    
    
    public Rover_Brain()
    {
    	
    	myuhfa = new UHFA();
    	mymemory = new Memory();
    	mymc = new Mast_Cam();
    }
    
  
    
    
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover Brain";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.00005);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, mymemory, mymc,myuhfa);
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rover_Brain myroverbrain = new Rover_Brain();
		myroverbrain.runSelfCheck();
Antenna myant = new Antenna();
myant.runSelfCheck();

		myroverbrain.Start_Process(); //starts the overall process
	}


	private void Start_Process()
	{
		// TODO Auto-generated method stub
		
		mymc.Move_Cam_Axis(); // to fix cam axis
		mymc.ThreeD_Picture(); // to take 3d picture
		mymc.Store_Picture(); // to store picture
		myuhfa.Antennacheck(); // to check antenna 
		myuhfa.Orbitor_Connection();// for orbitor connection
		mymemory.Transfer_Data(); // to initiate data transfer
	    
	}

}

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
		myroverbrain.Start_Process();
	}





	private void Start_Process()
	{
		// TODO Auto-generated method stub
		mymc.Move_Cam_Axis();
		mymc.ThreeD_Picture();
		mymc.Store_Picture();
		myuhfa.Antennacheck();
		myuhfa.Orbitor_Connection();
		mymemory.Transfer_Data();
	   // myuhfa.receive_confirmation();
	}

}

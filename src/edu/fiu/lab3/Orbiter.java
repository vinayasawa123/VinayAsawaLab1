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


public class Orbiter implements SelfCheckCapable {
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Orbiter";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	
	public void send_confirmation() {
		// TODO Auto-generated method stub
		// sends the confirmation to mars antenna and initiates the final bit 
		
		
		System.out.println("Sending Confirmation to mars antenna");
		UHFA myuhfa = new UHFA();
		myuhfa.Final_bit();
	}

	public void receive_signal() {
		// TODO Auto-generated method stub
		// starts the receiving process from mars antenna 
		System.out.println("Received signal from Earth//Connection Obtained");
			
		
	}

	public void Transmit_data() {
		// TODO Auto-generated method stub
		System.out.println("Sending data to Earth");
		Earth_Satellite myearth = new Earth_Satellite();
		myearth.Receivedata();
		//function to transmit data to earth initate the receving side of earth sateliite
	}

	public static void receive_confirmation() {
		// TODO Auto-generated method stub
		System.out.println("Data confirmation received");
		
		// receive the the final confirmation from earth
	}

	public void receive_data() {
		// TODO Auto-generated method stub
		System.out.println("data received");
		//received the data from mars
		
	}

	
	

}

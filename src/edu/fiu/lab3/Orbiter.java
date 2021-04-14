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

	public void receive_data() {
		// TODO Auto-generated method stub
		System.out.println("Data received from mars antenna");
		Orbiter myorbiter = new Orbiter();
		myorbiter.send_confirmation();
	}
	private void send_confirmation() {
		// TODO Auto-generated method stub
		System.out.println("Sending Confirmation to mars antenna");
		
	}

	public void receive_signal() {
		// TODO Auto-generated method stub
		
			System.out.println("Received signal from Earth//Connection Obtained");
			
		
	}

	public void Transmit_data() {
		// TODO Auto-generated method stub
		System.out.println("Sending data to Earth");
		Earth_Satellite.Receivedata();
		
	}

	public static void receive_confirmation() {
		// TODO Auto-generated method stub
		System.out.println("Data confirmation received");
	}

	
	

}

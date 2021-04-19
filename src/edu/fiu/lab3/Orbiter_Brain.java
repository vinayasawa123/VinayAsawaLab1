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
public class Orbiter_Brain implements SelfCheckCapable {
	Orbiter myorbiter;
	Earth_Satellite myEarth_Satellite;

	   public Orbiter_Brain()
	    {
		myorbiter =  new Orbiter();
		myEarth_Satellite = new Earth_Satellite();
		}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brain";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0005);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myorbiter);
	}
   
	
	public void receive_summary_mars() {
		// TODO Auto-generated method stub
		// reveive the mars rover summary and  starts the reveiceing on orbiter antenna 
		
		System.out.println("Starting the receiving process");
		myorbiter.receive_data();
		
		// also later when data is received send the confirmation 
		myorbiter.send_confirmation();
	}
	public void Catchsignal() {
		// TODO Auto-generated method stub
		// To catch the earth signal from earth dish or satellite.
		// then start enrth side transmition.
		System.out.println("Signal Received from earth");
		myorbiter.Transmit_data();
	}
}

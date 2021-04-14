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
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Orbiter_Brain myorbiterbrain = new Orbiter_Brain();
		myorbiterbrain.runSelfCheck();
		myorbiterbrain.Startreceiving();
		
		
		
	}
	private void Startreceiving() {
		// TODO Auto-generated method stub
		myorbiter.receive_data();
		
	}
}

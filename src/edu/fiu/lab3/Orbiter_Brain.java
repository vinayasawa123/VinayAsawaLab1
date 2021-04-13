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

	   public Orbiter_Brain()
	{
		myorbiter =  new Orbiter();
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
		//myorbiterbrain.Startreceiving();
		
		
	}
	private void Startreceiving() {
		// TODO Auto-generated method stub
		myorbiter.receive_data();
		
	}
}

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
public class Antenna implements SelfCheckCapable {

Memory mymemory;
Orbiter myorbiter;
Orbiter_Brain myorbiterbrain;
	
public Antenna()
{
	mymemory = new Memory();
	myorbiter = new Orbiter();
 myorbiterbrain = new Orbiter_Brain();
}
	

	
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.00005);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,mymemory,myorbiter,myorbiterbrain);
	}



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Anetnna";
	}

	
	
	

}

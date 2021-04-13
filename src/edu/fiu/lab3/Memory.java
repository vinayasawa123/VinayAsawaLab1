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
public class Memory implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Memory";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	public void Save_image() {
		// TODO Auto-generated method stub
		System.out.println("Image saved");
	
	}

	public void Transfer_Data() {
		// TODO Auto-generated method stub
		
		System.out.println("initiating transfer");
		
		Memory mymemory = new Memory();
		mymemory.Process_Information();
		
	}

	private void Process_Information() {
		// TODO Auto-generated method stub
		System.out.println("Processing info to be sent");
		
		System.out.println("Info ready to be sent");
		
		UHFA myuhfa = new UHFA();
		myuhfa.Transmit_Data();
	}

}

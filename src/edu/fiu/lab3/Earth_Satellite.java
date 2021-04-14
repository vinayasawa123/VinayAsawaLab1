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
public class Earth_Satellite implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Earth Satellite Dish";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0005);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	public static   void Receivedata() {
		// TODO Auto-generated method stub
		System.out.println("Data Received From Mars Orbiter");
		Earth_Satellite.Send_Confirmation();
	}

	private static  void Send_Confirmation() {
		// TODO Auto-generated method stub
		System.out.println("Sending Confirmation to mars orbiter");
		Orbiter.receive_confirmation();
	}

}

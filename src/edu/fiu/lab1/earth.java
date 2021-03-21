/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 18135
 *
 */
public class earth implements SelfCheckCapable {
String satellite;
String  operating_environment;
/**
 * String satellite is name of the satelite used
 * String operating enviroment is which spacecenter is controling it
 */


void send_commands() {
	/**
	 *this methods is used to send commands to rover
	 */
}

void revieve_data() {
	/**
	 * this method is used to reveive commands from rover
	 */
}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}

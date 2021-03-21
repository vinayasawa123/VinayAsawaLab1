/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;



/**
 * @author 18135
 *
 */
public class remotecontrol implements SelfCheckCapable {
String Ultra_high_feq_antenna;
String X_band_highgain_antenna;
String X_bandlow_antenna;
int memory;

/**
* String Ultra_high_feq_antenna is high frequency antenna
* String int X_band_highgain_antenna is highgain antenna
* String X_bandlow_antenna is low frequency antenna
* int memory is memory space left;
 */

void orbitor_communication() 
{
	/**
	 * method used to communicate with mars orbitor
	 */
}

void store_data()
{
	/**
	 * method used to store data
	 */
}



earth transmit_data()
{
	return null;
	/**
	 * method used to transmit data from earth
	 */
}

earth revieve_data() {
	return null;
	/**
	 * method used to recevice data from earth
	 */
}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my remotecontrol";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
		/**
		 * random check to check if sending data and recieving data fails 0.25 times
		 */
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}

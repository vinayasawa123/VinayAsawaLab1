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
public class power_source implements SelfCheckCapable {
int battery;
String protective_layer;
int nuclear_power;
int battery_temp;
/**
 * int battery; gives battery power left
* String protective_layer; gives the protective layer used
* int nuclear_power; gives the half life of the nuclear ion left
* int battery_temp; gives the battery temperature
 */


		
		void nuclear_power()
		{
			/**
			 * calculates the half life of ion
			 */
		}
		
		void battery_power()
		{
			/**
			 * calculates the secondary battery power
			 */
		}
		
		void power_check()
		{
			/**
			 * calculates the power flow 
			 */
		}
		
		rover temperature_check()
		{
			return null;
			/**
			 * checks the tempterature of rover
			 */
		}
		
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "my roverstemperature";
		}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
		/**
		 * to check if power_soruce fails to check teeperatue 0.1 times
		 */
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}

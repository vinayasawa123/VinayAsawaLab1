/**
 * 
 */
package edu.fiu.lab3;

/**
 * @author 18135
 *
 */
public class UHFA extends Antenna {
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UHFA";
	}

	public void Antennacheck() {
		// TODO Auto-generated method stub
		System.out.println("Anetnna is ok");
	}

	public void Orbitor_Connection() {
		// TODO Auto-generated method stub
		System.out.println("Waiting for Signal from mars orbiter");
		
		
		System.out.println("Connection obtained");
	}
	public void Transmit_Data() {
		// TODO Auto-generated method stub
		System.out.println("Sending Data to Oribter");
		myorbiterbrain.receive_summary_mars();
	}

	public void Final_bit() {
		// TODO Auto-generated method stub
		System.out.println("Final bit received and end of rover to satellite");
		Earth_Satellite myearthsatellite = new Earth_Satellite();
		myearthsatellite.sendsignal();
		
	}
	
	

}

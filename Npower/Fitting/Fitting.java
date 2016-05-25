import java.util.Scanner; 
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Fitting /*implement ActionListener*/ {
	

	
	static void Persona { 
	
	Scanner input = new Scanner (System.in);
	
	double shoulderMeasurement;
	double bustMeasurement;
	double waistMeasurement;
	double hipsMeasurement;
	//double height
	//double weight
	
	System.out.println("Please enter your shoulder measurement :  ");
	shoulderMeasurement = input.nextDouble();
	System.out.println("Please enter your bust measurement: ");
	bustMeasurement = input.nextDouble();
	System.out.println("Please enter your waist measurement: ");
	waistMeasurement = input.nextDouble();
	System.out.println("Please enter your hips measurement: ")
	hipsMeasurement = input.nextDouble();
	
	/*(if (click = female)
		else if (click = male)
	
	}*/
	
	/*static class female extend Persona{
		
	if (shoulderMeasuremnt||bustMeasurement / hipsMeasurement > 1.05 )
		System.out.print ("Your body type is 'Inverted Triangle'")
		else if (waistMeasurement / shoulderMeasuremnt > 0.75 && shoulderMeasurement || bustMeasurement || hipsMeasurement <= 0.05 )
			System.out.print("Your body type is 'Rectangle'")
		else if (hipsMeasurement > 0.05 && shoulderMeasurement || bustMeasurement > 1.05)
			System.out.print("Your body type is 'Pear'")
		else if (waistMeasurement / (shoulderMeasuremnt + bustMeasurement) && waistMeasurement / hipsMeasurement < 0.75 && shoulderMeasurement && hipsMeasurement < 20  )
			System.out.println("Your body type is 'Hourglass'")
		else 
			System.out.println("Your body type is 'Apple'")
		
	}*/
	
	/*public class Male extend Persona {
		
		
	}*/
	
	public static void main (String[] args){
		
		Persona result = new Persona ();
		
		System.out.print("result")
		
		
	}

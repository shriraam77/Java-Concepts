package intellect_seec;
import java.util.Scanner;

public class caseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name=sc.next();

	System.out.println("Enter the Date of Purchase:");
	int date= sc.nextInt();
	
	System.out.println("Enter the Bill Number");
	int billNo= sc.nextInt();
	
	if(date>=10)
	{
		if(billNo % 100 == date)
		{
			System.out.println("Hello " + name + ", you are one of our Lucky Customer");
		}
		else {
			System.out.println("Sorry " + name + ", you are not our lucky customer.");
			System.out.println("Happy Shopping with us !!");
		}
		
	}
	else if(date<10)
	{
		if(billNo % 10 == date)
		{
			System.out.println("Hello " + name + ", you are one of our Lucky Customer");
		}
		else {
			System.out.println("Sorry " + name + ", you are not our lucky customer.");
			System.out.println("Happy Shopping with us !!");

		}
	}
	}

}
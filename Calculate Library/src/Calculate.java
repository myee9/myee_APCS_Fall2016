/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square(int integer) {
		int answer;
		answer=integer*integer;
		return(answer);
	}		
	public static int cube(int integer) {
		int answer;
		answer=integer*integer*integer;
		return(answer); 
	}	
	public static double average(double number1, double number2, double numbers) {
		double answer;
		answer=(number1+number2)/numbers;
		return(answer);
	}
	public static double average(double number1, double number2, double number3, double numbers) {
		double answer;
		answer=(number1+number2+number3)/numbers;
		return(answer);
	}
	public static double toDegrees(double radians) {
		double answer;
		answer=(radians*(180/3.14159));
		return(answer);
	}
	public static double toRadians(double degrees) {
		double answer;
		answer=(degrees*(3.14159/180.0)); 
		return(answer);
	}
	
	public static double discriminant(double value1, double value2, double value3) {
		double answer;
		answer=(value2*value2)-4*value1*value3;
		return(answer);
	}	
	public static String toImproperFrac(int wholenumber, int fraction, int denominator) {
		String answer;
		answer=(wholenumber*denominator) + fraction + "/" + denominator;
		return(answer);
	}
	public static String toMixedNum(int wholenumber, int denominator) {
		String answer;
		answer=(wholenumber/denominator + "_" + wholenumber%denominator + "/" + denominator);
		return(answer);
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String foil;
		foil=((a*c + x +"^2") + " " +(a*d + b*c )+ x + " " + (b*d)); 
		return(foil);
	}
	public static boolean isDivisibleBy(int divisor, int dividend) {
		if(divisor%dividend==0) {
			return(true);
		}
		else {
			return(false);
		}
	
	}
	
	public static double absValue(double number) {
		if(number>0) {
			return(number);
		}
		else{
			return(number*-1);
		}
	}
	
	public static int max(int integer1, int integer2) {
		if(integer1>integer2) {
			return(integer1);
		}
		else
			return(integer2);
		}
	
	public static double max(double number1, double number2, double number3) {
		double maxnumber=0.0;
		if(number1>maxnumber) {
			maxnumber=number1;
		}
		if(number2>maxnumber) {
			maxnumber=number2;
		}
		if(number3>maxnumber) {
			maxnumber=number3;
		}
		return(maxnumber);
	}
	
	public static int min(int integer1, int interger2){
		if(integer1<interger2) {
			return(integer1);
		}
		else
			return(interger2);
		}
	
	public static double round2(double number) {
		double roundingnumber=number*100;
		roundingnumber=roundingnumber + 0.5;
		roundingnumber=(int)roundingnumber;
		return(roundingnumber/100);
	}
	
	public static double exponent(double base, int power) {
		double answer=1;
		for(int p=1; p<=power; p++) {
			answer=answer*base;
		}
		return(answer);
		
		
	}
	
	public static int factorial(int value) {
		int answer=1;
		for(int v=1; v<=value; v++) {
			answer=answer*v;
		}
		return(answer);
	}
	
	public static boolean isPrime(int number) {
		for(int i=2; i<number; i++) {
			while((Calculate.isDivisibleBy(number,i)==true)) {
				return false;
			}
		}
		return true;
	}
	
	public static int gcf(int numberone, int numbertwo) {
		int largernumber=Calculate.max(numberone, numbertwo);
		int smallernumber=Calculate.min(numberone, numbertwo);
		for(int a=1; a<=smallernumber; a++) {
			while(Calculate.isDivisibleBy(a, smallernumber)==true) {
				return a;
			}
		for(int b=1; b<=largernumber;b++) {
			while(Calculate.isDivisibleBy(a, largernumber)==true) {
				return b;
			}
		if(a==b) {
			return a;
		}
		}
		}
}
	public static double sqrt(double value) {
		
	}
	
}
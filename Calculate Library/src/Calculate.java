/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square(int number) {
		int answer;
		answer=number*number;
		return(answer);
	}		
	public static int cube(int number) {
		int answer;
		answer=number*number*number;
		return(answer); 
	}	
	public static double average(double n1, double n2, double numbers) {
		double answer;
		answer=(n1+n2)/numbers;
		return(answer);
	}
	public static double average(double n1, double n2, double n3, double numbers) {
		double answer;
		answer=(n1+n2+n3)/numbers;
		return(answer);
	}
	public static double toDegrees(double number) {
		double answer;
		answer=(number*(180/3.14159));
		return(answer);
	}
	public static double toRadians(double number) {
		double answer;
		answer=(number*(3.14159/180.0)); 
		return(answer);
	}
	
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer=(b*b)-4*a*c;
		return(answer);
	}	
	public static String toImproperFrac(int a, int b, int c) {
		String answer;
		answer=(a*c) + b + "/" + c;
		return(answer);
	}
	public static String toMixedNum(int a, int b) {
		String answer;
		answer=(a/b + "_" + a%b + "/" + b);
		return(answer);
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer9;
		answer9=(a*c + "x^2" + a*d + b*c + "x" + b*d); 
		//fixme
	}
	public static boolean isDivisibleBy(int a, int b) {
		if(a%b==0) {
			return(true);
		}
		else {
			return(false);
		}
	
	}
	
	public static double absValue(double n) {
		if(n>0) {
			return(n);
		}
		else{
			return(n*-1);
		}
	}
	
	public static int max(int a, int b) {
		if(a>b) {
			return(a);
		}
		else
			return(b);
		}
	
	public static double max(double a, double b, double c) {
		double maxnumber=0.0;
		if(a>maxnumber) {
			maxnumber=a;
		}
		if(b>maxnumber) {
			maxnumber=b;
		}
		if(c>maxnumber) {
			maxnumber=c;
		}
		return(maxnumber);
	}
	
	public static int min(int a, int b){
		if(a<b) {
			return(a);
		}
		else
			return(b);
		}
	
	public static double round2(double a) {
		double roundingnumber=a*100;
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
		
		
	}
	
	public static int gcf(int numberone, int numbertwo) {
		
	}
	
	public static double sqrt(double value) {
		
	}
	
}
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
		int answer1;
		answer1=number*number*number;
		return(answer1); 
	}	
	public static double average(double n1, double n2, double numbers) {
		double answer2;
		answer2=(n1+n2)/numbers;
		return(answer2);
	}
	public static double average(double n1, double n2, double n3, double numbers) {
		double answer3;
		answer3=(n1+n2+n3)/numbers;
		return(answer3);
	}
	public static double toDegrees(double number) {
		double answer4;
		answer4=(number*(180/3.14159));
		return(answer4);
	}
	public static double toRadians(double number) {
		double answer5;
		answer5=(number*(3.14159/180.0)); 
		return(answer5);
	}
	
	public static double discriminant(double a, double b, double c) {
		double answer6;
		answer6=(b*b)-4*a*c;
		return(answer6);
	}	
	public static String toImproperFrac(int a, int b, int c) {
		String answer7;
		answer7=(a*c) + b + "/" + c;
		return(answer7);
	}
	public static String toMixedNum(int a, int b) {
		String answer8;
		answer8=(a/b + "_" + a%b + "/" + b);
		return(answer8);
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer9;
		answer9=(a*c + "x^2" + a*d + b*c + "x" + b*d); 
		
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
	}
	
	public static double maxOverlaod(double a, double b, double c) {
		
	}
package exercises2;
import java.util.*;
public class exercises2 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	convertseconds();
	penultimate();
	sumprimenumber();
	printarea();
	convertbinary();	
    printoctal();	
	compare();
	printaverage();
	printtime();
	printnum();
	
	
	in.close();	

	}
	public static void convertseconds(){
		Scanner in = new Scanner(System.in);
	    System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
	    int p1 = seconds % 60;
	    int p2 = seconds / 60;
	    int p3 = p2 % 60;
	    p2 = p2 / 60;
	    System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
		
	}
	public static void penultimate() {
		Scanner in = new Scanner(System.in);
	    System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("Penultimate word: "+words[words.length - 2]);
		
	}
	public static void sumprimenumber() {
	int sum = 1;
	 int ctr = 0; 
	 int n = 0; 
   	
		while (ctr < 100) {
			n++; 
			if (n % 2 != 0) { 
			// check if the number is even
				if (is_Prime(n)) {
					sum += n; 					
				}
			}
                   ctr++; 	
		}
		System.out.println("\nSum of the prime numbers till 100: "+sum); 	
	}
	public static boolean is_Prime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
  	public static void printarea() {
  		final double width = 7.50;
        final double height =  10.00;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        
  	}
  	public static void convertbinary(){
  		 int dec_num, quot, i=1, j;
         int bin_num[] = new int[100];
         Scanner scan = new Scanner(System.in);
 		
         System.out.print("Input a Decimal Number : ");
         dec_num = scan.nextInt();
 		
         quot = dec_num;
 		
         while(quot != 0)
         {
             bin_num[i++] = quot%2;
             quot = quot/2;
         }
 		
         System.out.print("Binary number is: ");
         for(j=i-1; j>0; j--)
         {
             System.out.print(bin_num[j]);
         }
         System.out.print("\n");
        
  	}
	public static void printoctal() {
	     int dec_num, rem, quot, i=1, j;
	        int oct_num[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Input a Decimal Number: ");
	        dec_num = scan.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            oct_num[i++] = quot%8;
	            quot = quot/8;
	        }
			
	        System.out.print("Octal number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct_num[j]);
	        }
			System.out.print("\n");
	}
	public static void compare() {  
        Scanner input = new Scanner(System.in);
        int number1;        
        int number2;  
      
        System.out.print( "Input first integer: " );         
        number1 = input.nextInt();    
 
        System.out.print( "Input second integer: " );        
        number2 = input.nextInt();               
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 ); 
	}
	public static void printaverage() {
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		   
		  System.out.print("Input third number: ");
		  int num3 = in.nextInt();
		   
		  System.out.print("Input fourth number: ");
		  int num4 = in.nextInt();
		  
		  System.out.print("Enter fifth number: ");
		  int num5 = in.nextInt();
		   
		   
		  System.out.println("Average of five numbers is: " + 
		   (num1 + num2 + num3 + num4 + num5) / 5);
		
	}
	public static void printtime() {
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    
	}
	public static void printnum() {
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		   
		 
		  System.out.println(num1 + " + " + num2 + " = " + 
		  (num1 + num2));
		   
		  System.out.println(num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		   
		  System.out.println(num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   
		  System.out.println(num1 + " / " + num2 + " = " + 
		  (num1 / num2));
		 
		  System.out.println(num1 + " mod " + num2 + " = " + 
		  (num1 % num2));
		 
	}
	
		
	
	
	 
	
	

}


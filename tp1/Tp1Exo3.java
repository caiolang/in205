import java.util.Scanner;

class Tp1Exo3 {
	
	  public static void main(String[] args) {
		  
		  System.out.print("---------------\nFIBONACCI\n---------------\n\nChoose a Fibonacci iteration:\n");
		  
		  Scanner keyboard = new Scanner(System.in);
		  int fibId = keyboard.nextInt();
		  
		  int fibRes = fibonacci(fibId);
		
		  System.out.print("\nResult: " + fibRes);
		  
		  keyboard.close();
		  
	  }
	  
	  
	  private static int  fibonacci(int id) {
		  int old=0, cur=1, aux=0;
		  
		  for (int i=0;i<id;i++) {
			  aux=cur;
			  cur=cur+old;
			  old=aux;
			  System.out.print("\n> " + cur);
		  }
		  
		  return cur;
	  }
	  
	  
}

	import java.util.Scanner;

	public class Fibonacci
	{
	    public static void main(String[] args)
	    {
	        
	    Scanner in = new Scanner(System.in);
	    System.out.println("Ingresa un número:");
	    
		int n= in.nextInt();
		int fibonacci=n , suma=0 , suma1 = 1, cont=0; //El valor n es un valor variable/ al azar que vamos a escoger de la tabla de Fibonacci, suma =0 pq es un valor fijo q se debe iniciar con ese numero, suma=1 tambien es un valor fijo, cont=0 valor fijo porque debe empezar a fuerzas a contar desde 0
		
		do {
			fibonacci= suma;
			suma = suma1;
			suma1 = fibonacci + suma;
			
			System.out.println("Fibonacci" + "(" + fibonacci + ") = n(" + cont + ")");
			cont++;
			in.close();
		}while (cont <=n);		
			
		}//Main
}//Class Fibonacci

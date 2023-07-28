
	import java.util.Scanner;

	public class Tabla
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num, num1=1;
	        
	        System.out.print("Ingresa cualquier número entero positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicación de: " + num);
	        console.close();
	        
	        while (num1 <=10) {
	        System.out.println(num*num1);
	        num1++; //incrementa en 1 unidad lo que vale la variable num1
	        }
	        //TODO implement While loop to get print result
	    }
	}
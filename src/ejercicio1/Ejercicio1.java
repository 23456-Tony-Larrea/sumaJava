
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1=0;
int numero2=0;
int respuesta;
System.out.println("Introduce el primer número:");			
numero1 = reader.nextInt();
			
System.out.println("Introduce el segundo número:");
numero2 = reader.nextInt();

 respuesta=numero1+numero2;
 System.out.println("La respuesta es:"+respuesta);
   
    } 
}
    
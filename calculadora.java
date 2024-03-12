import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        

        double division = 0;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
        System.out.println("Ingrese la longitud del primer cateto del triángulo:");
        double cateto1 = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del segundo cateto del triángulo:");
        double cateto2 = scanner.nextDouble();
        
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        System.out.println("La hipotenusa del triángulo con catetos de longitud " + cateto1 + " y " + cateto2 + " es: " + hipotenusa);
        
        scanner.close();
    }
}

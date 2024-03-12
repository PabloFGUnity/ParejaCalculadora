import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double num2 = scanner.nextDouble();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    // Código para la resta
                    break;
                case 3:
                    // Código para la multiplicación
                    break;
                case 4:
                    // Código para la división
                    break;
                case 5:
                    // Código para la potenciación
                    break;
                case 6:
                    // Código para la raíz cuadrada
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

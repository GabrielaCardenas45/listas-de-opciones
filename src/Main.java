import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la lista:");
        System.out.println("1) Capturar dos valores, multiplicarlos, sumarlos y muestre el resultado de forma individual");
        System.out.println("2) Solicite el nombre y la edad  y validar si es mayor de edad y realizar un posible cobro");
        System.out.println("3) Calcular el área de un triángulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el primer valor: ");
                int valor1 = scanner.nextInt();
                System.out.print("Ingresa el segundo valor: ");
                int valor2 = scanner.nextInt();

                int suma = valor1 + valor2;
                int producto = valor1 * valor2;

                System.out.println("La suma de los 2 valores es: " + suma);
                System.out.println("El producto de los 2 valores es: " + producto);
                break;

            case 2:
                System.out.print("Ingresa tu nombre: ");
                String nombre = scanner.next();
                System.out.print("Ingresa tu edad: ");
                int edad = scanner.nextInt();

                if (edad >= 18) {
                    int cobro = 10000 * edad;
                    System.out.println(nombre+" El valor a cobrar es: " + cobro);
                } else {
                    System.out.println(nombre + "Usted no genera cobro.");
                }
                break;

            case 3:
                System.out.print("Ingresar la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresar la altura del triángulo: ");
                double altura = scanner.nextDouble();

                double area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;

            default:
                System.out.println("vea hermano escoja una de las 3 opciones!! (1, 2 o 3).");
        }
    }
}

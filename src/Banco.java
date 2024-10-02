import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nombre = "Melissa vallejos";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("************************************");
        // \n salto de línea
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo disponible es: USD " + saldo );
        System.out.println("\n***********************************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: USD " + saldo);
                    break;

                case 2:
                     System.out.println("¿Cúal es el valor que desea retirar?");
                     double valorARetirar = teclado.nextDouble();
                     if (valorARetirar > saldo) {
                        System.out.println("El saldo es insuficiente");
                     } else {
                            saldo = saldo - valorARetirar;
                            System.out.println("El saldo actualizado es: USD " + saldo);
                     }
                        break;
                case 3:
                    System.out.println("¿Cúanto es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: USD " + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }

}

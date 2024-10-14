import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculoConversion calculoConversion = new CalculoConversion();
        int opcion = 0;
        double conversion;

        System.out.println("\n\tSea bienvenido/a al Conversor de Moneda de Jonny");

        while(opcion != 7){
            // menu
            System.out.println("**************************************************************");
            System.out.println(
                      "1) Dolar USD       --> Peso mexicano MXN" +
                    "\n2) Peso mexicano   --> Dolar USD" +
                    "\n3) Dolar USD       --> Real brasileño BRL" +
                    "\n4) Real brasileño  --> Dolar USD" +
                    "\n5) Dolar USD       --> Peso colombiano COP" +
                    "\n6) Peso colombiano --> Dolar USD" +
                    "\n7) Salir.");

            // Escoger opciones
            System.out.print("Elija una opción válida: ");
            try {
                opcion = Integer.valueOf(scanner.nextLine());
                if (opcion == 7) {
                    System.out.println("Hasta luego!");
                    break;
                }

                System.out.print("Ingresa la cantidad a convertir: ");
                var cantidad = Double.valueOf(scanner.nextLine());

                System.out.println("**************************************************************");
                String divisaOrigen = "";
                String divisaDestino = "";
                switch (opcion) {
                    case 1:
                        divisaOrigen = "USD";
                        divisaDestino = "MXN";
                        break;
                    case 2:
                        divisaOrigen = "MXN";
                        divisaDestino = "USD";
                        break;
                    case 3:
                        divisaOrigen = "USD";
                        divisaDestino = "BRL";
                        break;
                    case 4:
                        divisaOrigen = "BRL";
                        divisaDestino = "USD";
                        break;
                    case 5:
                        divisaOrigen = "USD";
                        divisaDestino = "COP";
                        break;
                    case 6:
                        divisaOrigen = "COP";
                        divisaDestino = "USD";
                        break;
                    default:
                        System.out.println("Opción no valida, intentalo de nuevo.");
                        break;
                }

                // Llamar al calculo para la conversion
                conversion = calculoConversion.convertir(cantidad, divisaOrigen,divisaDestino);
                System.out.printf("La cantidad %.2f %s es igual a %.2f %s\n", cantidad, divisaOrigen, conversion, divisaDestino);
            } catch (NumberFormatException e){
                System.out.println("Entrada no valida.");
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

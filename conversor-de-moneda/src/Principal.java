import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\tSea bienvenido/a al Conversor de Moneda de Jonny");

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
        var opcion = Integer.valueOf(scanner.nextLine());
        System.out.print("Ingresa la cantidad a convertir: ");
        var cantidad = Double.valueOf(scanner.nextLine());
        System.out.println("**************************************************************");

        // Test
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda moneda = consultaMoneda.buscaMoneda("USD");
        System.out.println(moneda.conversion_rates().MXN());
    }
}

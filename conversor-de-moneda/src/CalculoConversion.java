public class CalculoConversion {
    public double convertir(double cantidad, String divisaOrigen, String divisaDestino){
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda moneda = consultaMoneda.buscaMoneda(divisaOrigen);

        // Seleccionar el tipo de cambio segun la divisa de destino
        double tasaDeCambio;
        switch (divisaDestino){
            case "MXN":
                tasaDeCambio = moneda.conversion_rates().MXN();
                break;
            case "USD":
                tasaDeCambio = moneda.conversion_rates().USD();
                break;
            case "BRL":
                tasaDeCambio = moneda.conversion_rates().BRL();
                break;
            case "COP":
                tasaDeCambio = moneda.conversion_rates().COP();
                break;
            default:
                throw new IllegalArgumentException("Divisa no soportada para la conversion: " + divisaDestino);
        }

        // Realizar el calculo de la conversion
        return cantidad * tasaDeCambio;
    }
}

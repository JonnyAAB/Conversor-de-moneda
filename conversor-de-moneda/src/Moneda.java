public record Moneda(ConversionRates conversion_rates) {
    public record ConversionRates(double USD,
                                  double MXN,
                                  double BRL,
                                  double COP){}
}

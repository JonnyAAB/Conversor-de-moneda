# Conversor de Moneda de Jonny
![Menú Principal](https://github.com/JonnyAAB/Conversor-de-moneda/blob/master/assets/Imagen%20principal.jpg)

## Descripción

Bienvenido al **Conversor de Monedas de Jonny**, una herramienta interactiva que permite realizar la conversión entre diferentes divisas. El programa soporta conversiones entre el dólar estadounidense (USD), el peso mexicano (MXN), el real brasileño (BRL) y el peso colombiano (COP), brindando tasas de conversión actualizadas.

Este conversor utiliza una API para consultar las tasas de conversión actualizadas, forma parte del programa ONE.

## Características

- Conversión entre:
  - USD ➡️ MXN
  - MXN ➡️ USD
  - USD ➡️ BRL
  - BRL ➡️ USD
  - USD ➡️ COP
  - COP ➡️ USD
- Interfaz de línea de comandos.
- Muestra mensajes claros y formatados para que el usuario vea rápidamente la cantidad convertida.

## Imagenes de la Interfaz

### Menú Principal

![Menú Principal](https://github.com/JonnyAAB/Conversor-de-moneda/blob/master/assets/Menu%20principal.PNG)

### Ejemplo de Conversión

![Ejemplo de Conversión](https://github.com/JonnyAAB/Conversor-de-moneda/blob/master/assets/Ejemplo%20de%20uso.PNG)

## Instalación

Sigue estos pasos para instalar y ejecutar el conversor de moneda en tu máquina local:

1. Clona el repositorio en tu máquina:

    ```bash
    git clone https://github.com/tu_usuario/conversor-moneda-jonny.git
    ```

2. Navega a la carpeta del proyecto:

    ```bash
    cd conversor-moneda-jonny
    ```

3. Compila el proyecto usando un compilador de Java:

    ```bash
    javac Principal.java ConversorMoneda.java ConsultaMoneda.java Moneda.java
    ```

4. Ejecuta el programa:

    ```bash
    java Principal
    ```

## Uso

1. Al ejecutar el programa, verás un menú con las opciones de conversión disponibles.
   
2. Ingresa la opción correspondiente a la conversión que deseas realizar (por ejemplo, '1' para convertir de USD a MXN).

3. A continuación, se te pedirá que ingreses la cantidad que deseas convertir.

4. El programa realizará la conversión y te mostrará el resultado con el formato adecuado.

5. Puedes continuar realizando más conversiones o salir del programa seleccionando la opción `7`.

## API de Conversión de Moneda

Este proyecto utiliza la API de [ExchangeRate-API](https://app.exchangerate-api.com) para obtener tasas de cambio actualizadas. Si estás interesado en usar esta API, puedes registrarte y obtener tu clave de API desde su página web. ¡Asegúrate de revisar su documentación para más detalles sobre las funcionalidades y limitaciones!

## Ejemplo de Uso

Aquí tienes un ejemplo de cómo se vería una sesión interactiva con el programa:

```plaintext
**************************************************************
Sea bienvenido/a al Conversor de Moneda de Jonny
**************************************************************
1) Dolar USD       --> Peso mexicano MXN
2) Peso mexicano   --> Dolar USD
3) Dolar USD       --> Real brasileño BRL
4) Real brasileño  --> Dolar USD
5) Dolar USD       --> Peso colombiano COP
6) Peso colombiano --> Dolar USD
7) Salir.
Elija una opción válida: 1
Ingresa la cantidad a convertir: 100
**************************************************************
La cantidad 100.00 USD es igual a 1800.00 MXN
**************************************************************

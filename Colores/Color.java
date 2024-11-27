package Colores;

// Define el enum 'Color' para representar los colores primarios: ROJO, AMARILLO y AZUL. Cada constante del enum debe incluir una propiedad adicional llamada 'valorHexadecimal', que represente el valor hexadecimal del color. Los valores hexadecimales correspondientes son: ROJO = "#FF0000", AMARILLO = "#FFFF00" y AZUL = "#0000FF". Posteriormente, crea la clase 'ConvertidorColor', que contenga un método denominado 'convertirHexadecimal', el cual tome como parámetro un valor hexadecimal. Este método deberá retornar el color correspondiente del enum si existe. En caso contrario, retornará null.

public enum Color {
    ROJO("#FF0000"),
    AMARILLO("#FFFF00"),
    AZUL("#0000FF");

    private String valorHexadecimal;

    private Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getValorHexadecimal() {
        return valorHexadecimal;
    }

    public void setValorHexadecimal(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public static Color convertirHexadecimal(String colorIngresado) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equals(colorIngresado))
                return color;
        }

        return null;
    }
}

package Colores;

import java.util.*;

public class AppColor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String color = "";
        Scanner lee = new Scanner(System.in);
        do {
            System.out.println("Ingrese un color en formato Hexadecimal (ejemplo #FF00FF); ");
            color = lee.nextLine();
            System.out.println();
            Color coloin = Color.convertirHexadecimal(color);
            // if (coloin != null) {
            // System.out.println("El color es: " + coloin.name());
            // } else {
            // System.out.println("No es un color primario");
            // }
            System.out.println(coloin != null ? "El color es: " + coloin.name() : "No es un color primario");
        } while (!color.equals("#"));
        lee.close();

    }
}
package Dias_Semana;

public class App {
    public static void main(String[] args) {

        DiaSemana[] dias = new DiaSemana[10];

        for (int i = 0; i < dias.length; i++) {
            int rnd = (int) (Math.random() * 7);
            dias[i] = DiaSemana.values()[rnd];

        }

        for (DiaSemana diaSemana : dias) {
            imprimirDiaLaboral(diaSemana);

        }

    }

    public static void imprimirDiaLaboral(DiaSemana dias) {
        System.out.println(dias.toString() + " " + (dias.esDiaLaboral() ? "Es dia laboral" : "No es dia laboral"));

    }

}

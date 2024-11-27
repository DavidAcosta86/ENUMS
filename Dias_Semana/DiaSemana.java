package Dias_Semana;

public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    // Método para determinar si el día es laboral
    public boolean esDiaLaboral() {
        // Los días laborables son LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
        return this != SABADO && this != DOMINGO;
    }
}

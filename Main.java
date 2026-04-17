package TEMA_4.Integradora;

/**
 * Programa que sigue la lógica de un bucle
 * @author Handrup
 */
public class Main {
    /**
     * Ejecuta un bucle do-while que incrementa un contador de 25 en 25 hasta llegar a 100.
     * @param args argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(final String[] args) {
        int resultado = 0;
        int base = 15;
        int suma = 20;
        int contador = 0;
        do {
            suma = 10 + base;
            contador = contador + suma;
            contador++;
            if (contador < 10) {
                resultado = 15;
                contador--;
            } else {
                resultado = 10;
                contador--;
            }
            int temp;
            temp = contador;
            resultado = temp;
        } while (contador < 100);
    }
}

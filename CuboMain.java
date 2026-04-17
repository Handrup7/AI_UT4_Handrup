package TEMA_4.Integradora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase principal para probar la funcionalidad de {@link Cubo}.
 *
 * Solicita al usuario 3 valores de lado, crea 3 cubos, muestra el área y el volumen
 * de cada uno y determina cuál tiene el mayor volumen.
 */
public class CuboMain {
    /**
     * Método principal que ejecuta el programa.
     *
     * Solicita al usuario 3 valores para los lados de cubos, crea los cubos,
     * muestra información de cada uno y presenta un resumen ordenado por volumen.
     *
     * @param args argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        ArrayList<Cubo> cubos = new ArrayList<>();
        Cubo cubo1 = new Cubo(pedirLado());
        Cubo cubo2 = new Cubo(pedirLado());
        Cubo cubo3 = new Cubo(pedirLado());

        cubos.add(cubo1);
        cubos.add(cubo2);
        cubos.add(cubo3);

        imprimirAreaBase(cubo1);
        imprimirVolumenCubo(cubo1);

        imprimirAreaBase(cubo2);
        imprimirVolumenCubo(cubo2);

        imprimirAreaBase(cubo3);
        imprimirVolumenCubo(cubo3);

        Collections.sort(cubos);
        Cubo mayor = cubos.getFirst();

        JOptionPane.showMessageDialog(null,
                "El cubo con MAYOR volumen es el de lado " + mayor.getLado()
                        + " y volumen " + String.format("%.2f", mayor.calcularVolumen())
        );

        StringBuilder mensaje = new StringBuilder("Cubos ordenados por volumen (mayor a menor):\n\n");
        for (Cubo cubo : cubos) {
            mensaje.append("Lado: ").append(cubo.getLado())
                    .append(" | Área base: ").append(String.format("%.2f", cubo.calcularAreaBase()))
                    .append(" | Volumen: ").append(String.format("%.2f", cubo.calcularVolumen()))
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());

    }

    /**
     * Solicita al usuario el valor del lado mediante un {@link JOptionPane}.
     *
     * @return el lado introducido por el usuario.
     * @throws NumberFormatException si el usuario introduce un valor no numérico.
     */
    public static int pedirLado() {
        while (true) {
            String entrada = JOptionPane.showInputDialog("Ingrese el valor del lado del cubo:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
                return -1;
            }

            try {
                int lado = Integer.parseInt(entrada);

                if (lado <= 0) {
                    JOptionPane.showMessageDialog(null, "El lado debe ser un número positivo.");
                } else {
                    return lado;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor introduce un número válido.");
            }
        }
    }


    /**
     * Muestra por pantalla el área de la base de un cubo.
     *
     * @param cubo cubo del que se quiere mostrar el área de la base.
     */
    public static void imprimirAreaBase(Cubo cubo){
        JOptionPane.showMessageDialog(null, "El área de la base del cubo (lado "
                + cubo.getLado() + ") es "+ String.format("%.2f", cubo.calcularAreaBase()));
    }

    /**
     * Muestra por pantalla el volumen de un cubo.
     *
     * @param cubo cubo del que se quiere mostrar el volumen.
     */
    public static void imprimirVolumenCubo(Cubo cubo) {
        JOptionPane.showMessageDialog(null, "El volumen del cubo (lado " +
                cubo.getLado() + ") es " + String.format("%.2f", cubo.calcularVolumen()));
    }
}

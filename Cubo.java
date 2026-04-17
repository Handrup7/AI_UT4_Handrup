package TEMA_4.Integradora;

/**
 * Representa un cubo definido por la longitud de su lado.
 *
 * Permite calcular el área de la base y el volumen. También implementa
 * {@link Comparable} para poder ordenar cubos por volumen (de mayor a menor).
 */
public class Cubo implements Comparable<Cubo> {
    /** Longitud del lado del cubo. */
    private int lado;

    public Cubo() {}

    /**
     * Crea un cubo indicando su lado
     * @param lado longitud del cubo
     */
    public Cubo(int lado) {
        this.lado = lado;
    }

    /**
     *  Devuelve el lado del cubo
     * @return lado del cubo
     */
    public int getLado() {
        return lado;
    }

    /**
     * Modifica el lado del cubo
     * @param lado del cubo
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área de la base del cubo.
     *
     * @return área de la base del cubo
     */
    public float calcularAreaBase(){
        return (float) lado * lado;
    }

    /**
     * Calcula el volumen del cubo.
     *
     * @return volumen del cubo.
     */
    public float calcularVolumen() {
        return (float) lado * lado * lado;
    }

    /**
     * Compara este cubo con otro por volumen para permitir ordenación.
     * En este caso se ordena de mayor a menor volumen.
     *
     * @param otro cubo con el que comparar.
     * @return un valor negativo si este cubo debe ir después (tiene menos volumen),
     *         cero si tienen el mismo volumen, o positivo si este cubo debe ir antes.
     */
    @Override
    public int compareTo(Cubo otro) {
        return Float.compare(otro.calcularVolumen(), this.calcularVolumen());
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                "Volumen=" + calcularVolumen() +
                '}';
    }
}

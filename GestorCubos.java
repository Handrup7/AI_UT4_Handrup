package TEMA_4.Integradora;

import java.util.ArrayList;
import java.util.Comparator;

public class GestorCubos {
    private ArrayList<Cubo> listaCubos;

    public GestorCubos() {
        this.listaCubos = new ArrayList<>();
    }

    public ArrayList<Cubo> getListaCubo() {
        return listaCubos;
    }

    public void setListaCubos(ArrayList<Cubo> listaCubos) {
        this.listaCubos = listaCubos;
    }

    public void ordenarCubos(ArrayList<Cubo> listaCubos) {
        listaCubos.sort(Comparator.comparing(Cubo::calcularVolumen));
    }

    public boolean cuboEntraCubo(Cubo cubo1, Cubo cubo2) {
        return cubo1.calcularAreaBase() < cubo2.calcularAreaBase();
    }

}

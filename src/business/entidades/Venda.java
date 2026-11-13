package business.entidades;

import business.comportamentos.Aprovavel;

public class Venda implements Aprovavel {
    int valor;
    boolean aprovado;

    @Override
    public void aprovar() {

    }

    @Override
    public void negar() {

    }
}

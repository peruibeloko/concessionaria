package business.entidades;

import business.atores.Cliente;
import business.comportamentos.Aprovavel;

import java.util.List;

public class Orcamento implements Aprovavel {
    CarroEmplacado carro;
    Cliente dono;
    int valor;
    List<Servico> servicos;
    String observacoes;
    boolean aprovado;

    @Override
    public void aprovar() {

    }

    @Override
    public void negar() {

    }

    void realizarServico(Servico servico) {
        servicos.add(servico);
    }
}

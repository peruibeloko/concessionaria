package atores;

import entidades.Carro;
import entidades.CarroEmplacado;
import entidades.Orcamento;

public class Mecanico extends Funcionario {
    Orcamento criarOrcamento(CarroEmplacado carro, Cliente cliente) {
        return new Orcamento();
    }

    Carro devolverCarro() {
        return new Carro();
    }
}

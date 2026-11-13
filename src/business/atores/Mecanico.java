package business.atores;

import business.entidades.Carro;
import business.entidades.CarroEmplacado;
import business.entidades.Orcamento;

public class Mecanico extends Funcionario {
    Orcamento criarOrcamento(CarroEmplacado carro, Cliente cliente) {
        return new Orcamento();
    }

    Carro devolverCarro() {
        return new Carro();
    }
}

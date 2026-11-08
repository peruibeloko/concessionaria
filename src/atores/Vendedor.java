package atores;

import entidades.Carro;
import entidades.Negociacao;
import entidades.Venda;

public class Vendedor extends Funcionario {

    void cadastrarCliente(Cliente cliente) {}

    Venda gerarVenda(Cliente cliente, Carro carro) {
        return new Venda();
    }

    Negociacao gerarNegociacao(Venda venda) {
        return new Negociacao();
    }
}

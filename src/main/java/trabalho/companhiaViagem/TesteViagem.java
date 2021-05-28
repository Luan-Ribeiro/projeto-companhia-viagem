package trabalho.companhiaViagem;

import java.io.IOException;

public class TesteViagem {
    public static void main(String[] agrs) throws IOException {
        Onibus onibus = new Onibus();
        Passagem guiche1 = new Passagem();

        //TODO rápido(ver esquema de pegar duas listas uma de nome e uma de cpf)
        for (int i = 0; i <= 42; i++) {
            Passageiro p = new Passageiro();
            p.receberDadosPassagem(i);
            guiche1.vendaPassagem(onibus, p);
        }

        onibus.mostrarListaPassageiros();
        guiche1.imprimirValorTotal();
    }
}

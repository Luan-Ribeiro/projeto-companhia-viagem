package trabalho.companhiaViagem;

import java.io.IOException;
import java.util.Scanner;

public class TesteViagem {
    public static void main(String[] agrs) throws IOException {
        Onibus onibus = new Onibus();
        Passagem guiche1 = new Passagem();

        //TODO rápido(ver esquema de pegar duas listas uma de nome e uma de cpf)
        for (int i = 0; i <= 40; i++) {
            Passageiro p = new Passageiro();
            p.setNome("teste" + i);
            p.setIdade(20 + i);
            p.setCpf("6599" + i);
            guiche1.vendaPassagem(onibus, p);
        }

        //TODO vai na fé
//        for(int i =0; i < 40; i++){
//            Passageiro p = new Passageiro();
//            p.receberDadosPassagem();
//            guiche1.vendaPassagem(onibus, p);
//        }
        onibus.mostrarListaPassageiros();
        guiche1.imprimirValorTotal();
    }
}

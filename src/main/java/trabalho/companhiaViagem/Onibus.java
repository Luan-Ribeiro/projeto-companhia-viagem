package trabalho.companhiaViagem;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Onibus {
    int limiteAssentos = 40;
    private int assentos;
    List<Passageiro> passageiros = new CopyOnWriteArrayList<>();

    public void adicionaPassageiro(Passageiro passageiro) {
        passageiros.add(this.assentos, passageiro);
        this.assentos++;
    }

    public void mostrarListaPassageiros() {
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro.toString());
        }
    }
}

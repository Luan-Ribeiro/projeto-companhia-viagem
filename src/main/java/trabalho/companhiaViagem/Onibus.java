package trabalho.companhiaViagem;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Onibus {
    private String rota;
    private int limiteAssentos = 40;
    private int assentos;
    private double valorTotalOnibus;
    List<Passageiro> passageiros = new CopyOnWriteArrayList<>();

    public void adicionaPassageiroSomaValor(Passageiro passageiro, Double valor) {
        valorTotalOnibus += valor;
        passageiros.add(this.assentos, passageiro);
        this.assentos++;
    }

    public void mostrarListaPassageiros() {
        System.out.println("Lista de Passageiros: \n");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro.toString());
        }
    }

    public int getLimiteAssentos() {
        return limiteAssentos;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public Double getValorTotalOnibus() {
        return valorTotalOnibus;
    }

    public void mostrarDadosOnibus() {
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" + "\n" +
                "############## Dados do Ônibus ##############" + "\n" +
                "Rota: " + rota + "\n" +
                "Quantidade de Passageiros: " + passageiros.size() + "\n" +
                "Valor total de passagens" + " = " + valorTotalOnibus + "\n" +
                "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }
}
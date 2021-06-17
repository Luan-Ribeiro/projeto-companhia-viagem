package trabalho.companhiaViagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GerenciaOnibus {
    private int numeroRota = 1;
    private int quantidadeOnibus = 0;
    private final List<Onibus> listaOnibus = new ArrayList<>(20);
    private double valorTotalPassagens;
    private int quantidadeTotalPassageiros;

    public void fluxoGerencia(Onibus onibus) {
        listaOnibus.add(quantidadeOnibus, onibus);
        quantidadeOnibus++;
        numeroRota++;
        valorTotalPassagens += onibus.getValorTotalOnibus();
        quantidadeTotalPassageiros += onibus.passageiros.size();
    }

    public int getQuantidadeOnibus() {
        return quantidadeOnibus;
    }

    public void mostrarRelatorioGeral(){
        System.out.println( "***********************************************************" + "\n" +
                "############## Relatório Geral ##############" + "\n" +
                "Quantidade de onibus em circulação: " + listaOnibus.size() + "\n" +
                "Total de passageiros: " + quantidadeTotalPassageiros + "\n" +
                "Valor total em passagens: R$" + valorTotalPassagens + "\n" +
                "***********************************************************");
    }

    public int getNumeroRota() {
        return numeroRota;
    }

    public void setNumeroRota(int numeroRota) {
        this.numeroRota = numeroRota;
    }

    public void menuGerencia(Onibus onibus){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo ao menu da gerencia:");
        System.out.println("Pressione 1: Mostrar dados dos onibus");
        System.out.println("Pressione 2: Mostrar dados dos onibus e passageiros");
        int opcao = scan.nextInt();
        if(opcao == 1) {
            onibus.mostrarDadosOnibus();
        }
        else if(opcao == 2){
            onibus.mostrarListaPassageiros();
        }
    }
}

package trabalho.companhiaViagem;

public class TesteViagem {

    public static void main(String[] agrs) {
        GerenciaCompanhia gerencia = new GerenciaCompanhia();
        for (int i = 0; i < 5; i++) {
            Onibus onibus = new Onibus();
            Guiche guiche = new Guiche();
            for (int j = 0; j < 40; j++) {
                Passageiro p = new Passageiro();
                p.receberDadosPassagem(j);
                guiche.vendaPassagem(onibus, p, gerencia);
            }
            gerencia.menuGerencia(onibus);
            gerencia.fluxoGerencia(onibus);
        }
        gerencia.mostrarRelatorioGeral();
    }
}

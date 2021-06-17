package trabalho.companhiaViagem;

public class Guiche {
    private double valor;

    public void vendaPassagem(Onibus onibus, Passageiro passageiro, GerenciaCompanhia g) {
        if (validaVendaPassagem(onibus, passageiro)) {
            onibus.setRota("São Paulo - Rio de Janeiro " + g.getNumeroRota());
            onibus.adicionaPassageiroSomaValor(passageiro, valor);
        }
    }

    public boolean validaVendaPassagem(Onibus onibus, Passageiro passageiro) {
        if (onibus.passageiros.size() < onibus.getLimiteAssentos()) {
            if (passageiro.getIdade() >= 18) {
                boolean conferido = confereCpf(onibus, passageiro);
                if (onibus.passageiros.size() <= onibus.getLimiteAssentos() * 0.7) {
                    this.valor = 10;
                } else {
                    this.valor = 15;
                }
                return conferido;
            } else {
                System.out.println("Venda não autorizada para " + passageiro.getNome() + ". Menor de idade!");
            }
        } else {
            System.out.println("Venda não autorizada para " + passageiro.getNome() + ", o ônibus estava cheio!");
        }
        return false;
    }

    private boolean confereCpf(Onibus onibus, Passageiro passageiro) {
        for (Passageiro p : onibus.passageiros) {
            if (passageiro.getCpf().equals(p.getCpf())) {
                System.out.println("Venda não autorizada para " + passageiro.getNome() + ". CPF já utilizado!");
                return false;
            }
        }
        return true;
    }
}
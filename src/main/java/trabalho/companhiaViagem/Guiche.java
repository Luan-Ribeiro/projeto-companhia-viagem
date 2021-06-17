package trabalho.companhiaViagem;

public class Passagem {
    private double valor;
    private double valorTotal;

    public void vendaPassagem(Onibus onibus, Passageiro passageiro) {
        if (validaVendaPassagem(onibus, passageiro)) {
            valorTotal += valor;
            onibus.adicionaPassageiro(passageiro);
        }
    }

    public boolean validaVendaPassagem(Onibus onibus, Passageiro passageiro) {
        if (onibus.passageiros.size() <= onibus.limiteAssentos) {
            if (passageiro.getIdade() >= 18) {
                boolean conferido = confereCpf(onibus, passageiro);
                if (onibus.passageiros.size() <= onibus.limiteAssentos * 0.7) {
                    this.valor = 10;
                } else {
                    this.valor = 15;
                }
                return conferido;
            } else {
                System.out.println("Venda não autorizada para " + passageiro.getNome() + ". Menor de idade!");
            }
        } else {
            System.out.println("Desculpe " + passageiro.getNome() + ", o ônibus está cheio!");
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

    public void imprimirValorTotal() {
        System.out.println("Valor total de passagens = " + valorTotal);
    }
}

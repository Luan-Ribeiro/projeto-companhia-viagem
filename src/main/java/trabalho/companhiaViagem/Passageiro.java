package trabalho.companhiaViagem;

public class Passageiro {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void receberDadosPassagem(int numero) {
        String[] cpfs = new String[]{"56316411278", "18579682630", "83947976100", "71710515104", "19076987106", "50754989496", "45413500688", "58321417256", "94851663897", "16567164611",
                "64772628860", "48608797089", "61325955973", "17438590828", "87586486158", "24577749777", "23305095458", "11243565330", "19255855573", "11187229814", "62658575505",
                "23746772737", "14994436509", "48767645143", "36427541200", "79049504566", "04471772813", "32581404566", "72684832870", "58926265390", "43519781808", "04673661605",
                "02590516754", "26447864101", "21298753864", "48428212481", "45183658447", "66178012292", "82514235030", "11848914784", "18315605186", "92907216856", "92907216856"};
        String[] nomes = new String[]{"Byetaus", "Wadue", "Dicar", "Luixa", "Arrue", "Wocaziza", "Tini", "Rimas", "Ruxuca", "Plelo", "Vaxye", "Teibi", "Remuwao", "Masey", "Sukol", "Ruwe", "Cudei",
                "Luwon", "Vyewa", "Niovi", "Mimouda", "Karei", "Maces", "Koypeugu", "Lahue", "Wules", "Kius", "Koyalr", "Beinn", "Bokun", "Puzel", "Quios", "Camou", "Engon", "Wiano", "Bufos", "Nelol",
                "Foazo", "Hier", "Poxya", "Lukau", "Kade", "Huana",};
        setNome(nomes[numero]);
        setCpf(cpfs[numero]);
        setIdade(18 + numero);
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n" +
                "idade: " + this.idade + "\n" +
                "cpf: " + this.cpf + "\n" +
                "-----------------------------------";
    }
}

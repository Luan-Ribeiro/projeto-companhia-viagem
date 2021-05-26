package trabalho.companhiaViagem;

import java.io.IOException;
import java.util.Scanner;

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

    public void receberDadosPassagem() throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        this.nome = scan.nextLine();

        System.out.println("Insira a idade: ");
        this.idade = scan.nextInt();

        System.out.println("Insira o cpf: ");
        this.cpf = scan.next();
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n" +
                "idade: " + this.idade + "\n" +
                "cpf: " + this.cpf + "\n" +
                "-----------------------------------";
    }
}

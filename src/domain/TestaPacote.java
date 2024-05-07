package domain;

public class TestaPacote {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

         //Utilizando metodos get\set
        p.setNome("Zé da Silva ");
        System.out.printf("Nome: " + p.getNome());
    }
}

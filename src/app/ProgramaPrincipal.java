package app;

import domain.Pessoa;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        // A linha de baixo acusa erro pois nao consegue acessar o atributo nome
        //System.out.println(fulano.nome);

    }
}

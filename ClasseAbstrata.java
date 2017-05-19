/*
Nome do Desenvolvedor: Leonardo J. S. Barros.
Data: 19/05/2017

Sistema de transito

Sistema desenvolvido para disciplina de Linguagem de Programação
da FATEC Zone Leste.

Classe Abstrata:
Define a variavel heterogenia.

*/
class ClasseAbstrata {

    int codigo;
    String nome;
    int qtd;
    int tipo;

    // construtor	 
    ClasseAbstrata() {
        this(0, "", 0, 0);
    }

    ClasseAbstrata(int ACodigo,
            String ANome,
            int AQtd,
            int ATipo) {
        codigo = ACodigo;
        nome = ANome;
        qtd = AQtd;
        tipo = ATipo;
    }
}

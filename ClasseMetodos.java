/*
Nome do Desenvolvedor: Leonardo J. S. Barros.
Data: 19/05/2017

Sistema de transito

Sistema desenvolvido para disciplina de Linguagem de Programação
da FATEC Zone Leste.

Classe Metodos:
Contem todos os metodos utilizados na classe principal

*/
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ClasseMetodos {

    public void FTipo(ClasseAbstrata[] Dados) throws IOException {
        String Saida = new String();
        int i, j;
        ClasseAbstrata[] Aux = new ClasseAbstrata[4];
        Aux[0] = new ClasseAbstrata();

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (Dados[j].codigo > Dados[j + 1].codigo) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (Dados[j].qtd > Dados[j + 1].qtd) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (Dados[j].tipo > Dados[j + 1].tipo) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        for (i = 0; i < 5; i++) {
            Saida += "Tipo: " + Dados[i].tipo + " Qtd: " + Dados[i].qtd + " Nome Cidade: " + Dados[i].nome + " Cod.: " + Dados[i].codigo + "\n";
        }
        JOptionPane.showMessageDialog(null, Saida);
    }

    public ClasseAbstrata[] FCadastraEstatistica(ClasseAbstrata[] Dados) throws IOException {
        int i;
        Random gerador = new Random();
        String Saida = new String();

        for (i = 0; i < 15; i++) {
            Dados[i] = new ClasseAbstrata();
            Dados[i].qtd = gerador.nextInt(1000);
            Dados[i].tipo = gerador.nextInt(4);
            switch (gerador.nextInt(5)) {
                case 0:
                    Dados[i].nome = "São Paulo";
                    Dados[i].codigo = 0;
                    break;
                case 1:
                    Dados[i].nome = "Rio de Janeiro";
                    Dados[i].codigo = 1;
                    break;
                case 2:
                    Dados[i].nome = "Curitiba";
                    Dados[i].codigo = 2;
                    break;
                case 3:
                    Dados[i].nome = "Recife";
                    Dados[i].codigo = 3;
                    break;
                case 4:
                    Dados[i].nome = "Manaus";
                    Dados[i].codigo = 4;
                    break;
                default:
                    break;
            }
            Saida += "COD: " + Dados[i].codigo + " Cidade: " + Dados[i].nome + " Qtd: " + Dados[i].qtd + " Tipo: " + Dados[i].tipo + "\n";
        }
        JOptionPane.showMessageDialog(null, Saida);
        return Dados;
    }

    public void PQtdAcidentes(ClasseAbstrata[] Dados) throws IOException {

        String Saida = new String();

        int i, j, cidade;
        ClasseAbstrata[] Aux = new ClasseAbstrata[1];
        ClasseAbstrata[] Aux2 = new ClasseAbstrata[15];
        Aux[0] = new ClasseAbstrata();

        for (i = 0; i < 15; i++) {
            for (j = 0; j < 14; j++) {
                if (Dados[j].codigo > Dados[j + 1].codigo) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }
        for (i = 0; i < 15; i++) {
            Aux2[i] = new ClasseAbstrata();
        }
        for (i = 0; i < 15; i++) {
            cidade = Dados[i].codigo;
            Aux2[cidade].nome = Dados[i].nome;
            Aux2[cidade].qtd = Aux2[cidade].qtd + Dados[i].qtd;
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (Aux2[j].qtd > Aux2[j + 1].qtd) {
                    Aux[0] = Aux2[j];
                    Aux2[j] = Aux2[j + 1];
                    Aux2[j + 1] = Aux[0];
                }
            }
        }
        for (ClasseAbstrata a : Aux2) {
            if (a.qtd != 0) {
                Saida += a.nome + " teve " + a.qtd + " acidentes.\n";
            }
        }
        JOptionPane.showMessageDialog(null, Saida);
    }

    public void PConsultaAcidentes(ClasseAbstrata[] Dados) throws IOException {

        String Saida = new String();
        ClasseAbstrata[] Aux = new ClasseAbstrata[1];
        Aux[0] = new ClasseAbstrata();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 14; j++) {
                if (Dados[j].qtd > Dados[j + 1].qtd) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 14; j++) {
                if (Dados[j].codigo > Dados[j + 1].codigo) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            Saida += "Cod.: " + Dados[i].codigo + " - Cidade: " + Dados[i].nome + " - Qtd.: " + Dados[i].qtd + " - Tipo: " + Dados[i].tipo + "\n";
        }
        JOptionPane.showMessageDialog(null, Saida);
    }

    public void ConsultaMedia(ClasseAbstrata[] Dados) throws IOException {
        String Saida = new String();
        int media = 0;

        int i, j;
        ClasseAbstrata[] Aux = new ClasseAbstrata[1];
        ClasseAbstrata[] Aux2 = new ClasseAbstrata[15];
        Aux[0] = new ClasseAbstrata();

        for (i = 0; i < 15; i++) {
            for (j = 0; j < 14; j++) {
                if (Dados[j].codigo > Dados[j + 1].codigo) {
                    Aux[0] = Dados[j];
                    Dados[j] = Dados[j + 1];
                    Dados[j + 1] = Aux[0];
                }
            }
        }

        int cidade;
        for (i = 0; i < 15; i++) {
            Aux2[i] = new ClasseAbstrata();
        }

        for (i = 0; i < 15; i++) {
            cidade = Dados[i].codigo;
            Aux2[cidade].nome = Dados[i].nome;
            if (i == 0) {
                Aux2[cidade].qtd = Dados[i].qtd;
            } else {
                Aux2[cidade].qtd = Aux2[cidade].qtd + Dados[i].qtd;
            }
            media += Dados[i].qtd;
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {

                if (Aux2[j].qtd > Aux2[j + 1].qtd) {

                    Aux[0].qtd = Aux2[j].qtd;
                    Aux[0].nome = Aux2[j].nome;

                    Aux2[j].qtd = Aux2[j + 1].qtd;
                    Aux2[j].nome = Aux2[j + 1].nome;

                    Aux2[j + 1].qtd = Aux[0].qtd;
                    Aux2[j + 1].nome = Aux[0].nome;
                }
            }
        }

        Saida = "Cidade com menor numero de acidentes:\n" + Aux2[0].nome + " com " + Aux2[0].qtd + " acidentes.\n\n";
        Saida += "Cidade com maior numero de acidentes:\n" + Aux2[4].nome + " com " + Aux2[4].qtd + " acidentes.\n\n";
        Saida += "Cidades com acidentes acima da média: Média->" + (media / 5) + "\n";
        for (i = 0; i < 5; i++) {
            if (Aux2[i].qtd > (media / 5)) {
                Saida += Aux2[i].nome + " com " + (Aux2[i].qtd - (media / 5)) + " acidentes a mais que a média\n";
            }
        }

//        for (i = 0; i < 5; i++) {
//
//            Saida += Aux2[i].nome + " teve " + Aux2[i].qtd + " acidentes.\n";
//        }
        JOptionPane.showMessageDialog(null, Saida);

//        Saida = "Consulta por quantidade de acidentes > 100 e < 500\n";
//        for (i = 0; i < 5; i++) {
//            if (Aux2[i].qtd > 100 && Aux2[i].qtd < 500) {
//                Saida += Aux2[i].nome + " teve " + Aux2[i].qtd + " acidentes.\n";
//            }
//        }
//        JOptionPane.showMessageDialog(null, Saida);
    }
}

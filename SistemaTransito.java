/*
Nome do Desenvolvedor: Leonardo J. S. Barros.
Data: 19/05/2017

Sistema de transito

Sistema desenvolvido para disciplina de Linguagem de Programação
da FATEC Zone Leste.

Classe Principal

*/
import java.io.IOException;
import javax.swing.JOptionPane;

public class SistemaTransito {

    public static void main(String arg[]) throws IOException {
        
        ClasseAbstrata[] Dados = new ClasseAbstrata[15];
        ClasseMetodos Metodos = new ClasseMetodos();
        
        String str_menu = "                   MENU ESTATÍSTICA\n\n";
        str_menu += "        Estatísticas de acidentes em 2015\n\n";
        str_menu += "1 - Cadastro Estatística\n";
        str_menu += "2 - Consulta por tipo de veículo\n";
        str_menu += "3 - Consulta por quantidade de acidentes\n";
        str_menu += "4 - Consulta todos as cidades\n";
        str_menu += "5 - Consulta maior menor média de acidentes\n";
        str_menu += "9 - Finaliza\n";
        int menu = 0;
        while (menu != 9) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(str_menu));
            switch (menu) {
                case 1:
                    Metodos.FCadastraEstatistica(Dados);
                    break;
                case 2:
                    Metodos.FTipo(Dados);
                    break;
                case 3:
                    Metodos.PQtdAcidentes(Dados);
                    break;
                case 4:
                    Metodos.PConsultaAcidentes(Dados);
                    break;
                case 5:
                    Metodos.ConsultaMedia(Dados);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FINALIZADO ");
                    menu = 9;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }
}

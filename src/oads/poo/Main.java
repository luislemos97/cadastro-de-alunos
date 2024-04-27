package oads.poo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        int op=0;

        while (op != 99) {

            JOptionPane.showMessageDialog(null, " Bem vindo ao nosso programa em JAVA da turma OADS03! \n");
            JOptionPane.showMessageDialog(null, " Vamos cadastrar suas informações! \n");

            op = Integer.parseInt(JOptionPane.showInputDialog(null, " Escolha uma das opções do menu: \n" + "1- Cadastrar Aluno \n" +
                    "" + "2-  Cadastrar Notas \n" + "3- Listar Informações " + "\n4- Sair "));

            switch (op) {

                case 1: {

                    JOptionPane.showMessageDialog(null, " Cadastrar Aluno \n");
                    aluno1.cadastrar_aluno();
                    break;
                }
                case 2: {

                    JOptionPane.showMessageDialog(null, " Cadastrar Notas \n");
                    aluno1.cadastrar_notas();
                    break;
                }
                case 3: {

                    JOptionPane.showMessageDialog(null, " Listar Informações \n");
                    aluno1.listar_informaçoes();
                    break;
                }
                case 4: {

                    JOptionPane.showMessageDialog(null, " Programa Finalizado \n");
                    op = 99;
                    break;
                }

            }
        }
        }
    }


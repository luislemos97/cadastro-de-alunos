package oads.poo;

import javax.swing.JOptionPane;

public class Aluno {

    String nome, cep, cidade, disciplina;
    int idade,cpf;
    float nota1 = 0,nota2 = 0, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public void cadastrar_aluno () {

        JOptionPane.showMessageDialog(null, " Bem vindos ao Nosso programa! \n");
        JOptionPane.showMessageDialog(null, "Vamos cadastrar suas informações \n");

        nome = JOptionPane.showInputDialog(" informe o seu nome: \n");
        cep = JOptionPane.showInputDialog(" informe o seu cep: \n");
        cidade = JOptionPane.showInputDialog(" informe o seu cidade: \n");
        disciplina = JOptionPane.showInputDialog(" informe a sua disciplina: \n");
        idade = Integer.parseInt(JOptionPane.showInputDialog(" informe a sua idade: " + nome + "\n"));
        cpf = Integer.parseInt(JOptionPane.showInputDialog(" informe a sua cpf: " + nome + "\n"));

    }

    public void cadastrar_notas (){

        nota1 = Float.parseFloat(JOptionPane.showInputDialog(" Informe sua nota1:" + nota1+ "\n"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(" Informe sua nota2:" + nota2 + "\n"));

        media = (nota1 + nota2) / 2;
    }

    public void listar_informaçoes () {

        JOptionPane.showMessageDialog(null, " Aluno: " +nome+ " Da Disciplina:" +disciplina+ "\nTem sua media de notas das provas 1 e 2 de resultado:" +media );

    }
}

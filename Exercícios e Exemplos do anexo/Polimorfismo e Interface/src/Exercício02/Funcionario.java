package Exercício02;

public abstract class Funcionario {
    private long id;
    private String nome;
    private String telefone;
    private int matricula;
    private String endereco;

    public Funcionario(long id, String nome, String endereco, int matricula, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.telefone = telefone;
    }
    public abstract void calculaSalario();
}

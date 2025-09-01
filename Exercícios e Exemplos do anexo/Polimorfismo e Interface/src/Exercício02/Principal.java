package Exercício02;

public class Principal {
    public static void main(String[] args) {
        Jornada jornada = new Jornada(1, "João", "1111-1111", 101, "Rua A", 20.0, 160);
        Horista horista = new Horista(2, "Maria", "2222-2222", 102, "Rua B", 30.0, 120);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(3, "Empresa Z", "3333-3333", 103, "Rua C", 10000.0, 2500.0);

        jornada.calculaSalario();
        horista.calculaSalario();
        pessoaJuridica.calculaSalario();
    }
}

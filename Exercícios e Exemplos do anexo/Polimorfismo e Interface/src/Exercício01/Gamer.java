package Exercício01;

public class Gamer implements Computador{

    @Override
    public void ligar() {
        System.out.println ("Gamer: Ligando o Sistema...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Gamer: Reiniciando o Sistema...");
    }

    @Override
    public void desligar() {
        System.out.println ("Gamer: Desligando o sistema...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println ("Gamer: Carregando o sistema...");
    }
}

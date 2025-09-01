package Exercício01;

public class Home implements Computador {
    @Override
    public void ligar() {
        System.out.println ("Home: Ligando o Sistema...");
    }

    @Override
    public void reiniciar() {
       System.out.println ("Home: Reiniciando o sistema...");
    }

    @Override
    public void desligar() {
       System.out.println ("Home: Desligando o sistema...");
    }

    @Override
    public void carregandoSistema() {
       System.out.println ("Home: Carregando o sistema...");
    }
}

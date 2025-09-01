package Exercício01;

public class Principal {
    public static void main (String [] args){
        Computador gamer = new Gamer ();
        gamer.ligar();
        gamer.reiniciar();
        gamer.desligar();
        gamer.carregandoSistema();

        System.out.println ();

        Computador home= new Home ();
        home.ligar();
        home.reiniciar();
        home.desligar();
        home.carregandoSistema();
    }
}

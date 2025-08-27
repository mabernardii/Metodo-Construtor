import java.util.Scanner;
public class ConstrutorPessoa {
    public static void main (String [] args){
        Scanner ler= new Scanner (System.in);
        System.out.println ("Insira o nome do jogador 01:");
        String nome1=ler.nextLine();
        System.out.println ("Qual a idade do jogador 01?:");
        int idade1= ler.nextInt();
        ler.nextLine();
        System.out.println ("Insira o nome do jogador 02:");
        String nome2=ler.nextLine();

        Pessoa jogador1= new Pessoa ();

        Pessoa jogador2 = new Pessoa ();
        jogador2.setNome (nome1);
        jogador2.setIdade (idade1);

        Pessoa jogador3 = new Pessoa ();
        jogador3.setNome (nome2);

        System.out.println ("---------- Informações dos jogadores: ---------");
        System.out.println ("-----Jogador 01-----");
        System.out.println (jogador2.getNome());
        System.out.println (jogador2.getIdade()+" anos");
        System.out.println ("-----Jogador 02-----");
        System.out.println (jogador3.getNome());
    }
}

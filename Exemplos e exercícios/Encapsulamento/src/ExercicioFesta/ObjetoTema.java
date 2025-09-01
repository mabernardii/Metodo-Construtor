package ExercicioFesta;

public class ObjetoTema {
    public static void main(String [] args) {
        Tema tema = new Tema (2, "Cassino", 5000, "Vermelho");

        System.out.println ("--------Tema da festa--------");
        System.out.println ("Id:"+ tema.getId());
        System.out.println ("Nome: "+ tema.getNome());
        System.out.println ("Valor do Aluguel: R$"+ tema.getValorAluguel());
        System.out.println ("Cor da Toalha de decoração: "+ tema.getCorToalha());

    }
}

package ExercicioFesta;

public class ObjetoItemTema {
    public static void main (String [] args) {
        ItemTema itemTema = new ItemTema(4, "cassino", "Festa com jogos de cassino!");
        System.out.println("-------Item Festa--------");
        System.out.println ("Id:"+ itemTema.getId());
        System.out.println ("Nome: " + itemTema.getNome());
        System.out.println ("Descrição: "+ itemTema.getDescricao());
    }
}

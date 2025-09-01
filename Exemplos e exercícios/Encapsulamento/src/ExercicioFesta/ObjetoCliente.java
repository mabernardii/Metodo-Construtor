package ExercicioFesta;

public class ObjetoCliente {
    public static void main (String []args){
        Cliente cliente = new Cliente (3, "Maria Eduarda", "(15)9745-9856", "678.005.234-67", "088.794.678-73");
        System.out.println ("--------Cliente--------");
        System.out.println ("Id:"+cliente.getId());
        System.out.println ("Nome: "+ cliente.getNome());
        System.out.println ("Telefone: "+ cliente.getTelefone());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println ("RG: "+ cliente.getRg());

    }
}

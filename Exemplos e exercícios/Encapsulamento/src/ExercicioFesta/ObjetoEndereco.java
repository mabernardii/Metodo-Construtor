package ExercicioFesta;

public class ObjetoEndereco {
    public static void main (String [] args ){
        Endereco endereco= new Endereco (5, "Rua Abilio Dutra", 17, "Jardim das Flores","Casa", "Aracaju", "18015-129", "SP");
        System.out.println ("--------Endereço da festa--------");
        System.out.println ("Id: "+ endereco.getId());
        System.out.println ("Logradouro: "+ endereco.getLogradouro());
        System.out.println ("Número: "+ endereco.getNumero());
        System.out.println ("Bairro: "+ endereco.getBairro());
        System.out.println ("Complemento: "+ endereco.getComplemento());
        System.out.println ("Cidade: "+ endereco.getCidade());
        System.out.println ("CEP: "+ endereco.getCep());
        System.out.println ("UF: "+ endereco.getUf());

    }
}

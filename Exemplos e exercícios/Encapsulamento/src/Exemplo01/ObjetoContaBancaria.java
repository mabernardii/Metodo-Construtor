package Exemplo01;

public class ObjetoContaBancaria {
    public static void main (String [] args){
        ContaBancaria conta = new ContaBancaria(100000.00);

        //Saldo inicial
        System.out.println (conta.getSaldo());

        // Depósitos
        conta.depositar(500);
        conta.depositar(1000);

        //Mostrar saldo após 2 depósitos
        System.out.println (conta.getSaldo());

        //Saque
        conta.sacar (1500);

        //Mostar após saque
        System.out.println (conta.getSaldo());
    }
}

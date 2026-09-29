public class SistemaDeconta {

    public static void main(String[] args) {

        Conta conta1 = new Conta(123, "Rayllan", 500);

        System.out.println(
            "Saldo: R$ " + conta1.consultarSaldo()
        );

        conta1.depositar(200);

        System.out.println(
            "Saldo após depósito: R$ " + conta1.consultarSaldo()
        );

        conta1.sacar(100);

        System.out.println(
            "Saldo após saque: R$ " + conta1.consultarSaldo()
        );
    }
}
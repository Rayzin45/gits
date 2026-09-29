    public class Conta {
        
        public int numeroConta;
        protected String titular;
        private double saldo;

    

    public Conta(int numeroConta, String titular, double saldo) {
        
         if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException(
                "Titular não pode ser vazio."
            );
        }
    
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
        

    public void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                "O depósito deve ser maior que zero."
            );
        }

        saldo += valor;
    }


    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                "O saque deve ser maior que zero."
            );
        }

        if (valor > saldo) {
            throw new IllegalArgumentException(
                "Saldo insuficiente."
            );
        }

        saldo -= valor;
    }


    public double consultarSaldo() {
        return saldo;
    }
}



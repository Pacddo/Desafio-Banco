public class Contapupanca extends Conta {


    public Contapupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular %s", super.cliente.getNome()));
        System.out.println("Extrato Conta Poupança");
        System.out.println(String.format("Agencia %d",super.agencia));
        System.out.println(String.format("Conta %d",super.conta));
        System.out.println(String.format("Saldo %.2f",super.saldo));


}
    }

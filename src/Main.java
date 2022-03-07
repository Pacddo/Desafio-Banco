public class Main {
    public static void main(String[] args) {
     Cliente douglas = new Cliente();
     douglas.setNome("Douglas");
     Conta cc = new ContaCorrente (douglas);
     Conta pupanca = new Contapupanca(douglas);

        cc.imprimirExtrato();
        pupanca.imprimirExtrato();

    }
}

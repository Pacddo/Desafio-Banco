import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Id,Abrir;

        while (true) {
            System.out.println("Deseja abrir uma conta? s/n ");
            Abrir = scan.next();
            if (Abrir.equals("n")) {break;
            }else if (Abrir.equals("s")) {


                System.out.println("Digite seu nome: ");
                Id = scan.next();


                Cliente pessoa = new Cliente();
                pessoa.setNome(Id);
                Conta cc = new ContaCorrente(pessoa);
                Conta pupanca = new Contapupanca(pessoa);

                cc.imprimirExtrato();
                pupanca.imprimirExtrato();
            }else {
                System.out.println("insira um caractere correto!");
            }





        }
    }
}

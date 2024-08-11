import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        sc.nextLine(); //comando necessário para consumir o espaço dado anteriormente.
        String agencia = sc.nextLine();
        System.out.print("Por favor, insira o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Por favor, insora o seu saldo: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nome, saldo);
        //Exibir a mensagem conta criada
        System.out.println(conta.toString());

        sc.close();
    }
}
import java.util.Locale;
import java.util.Scanner;


public class CatibBaNK {
    public static void main(String[] args) throws Exception {
        // inserindo os dados bancarios 
        
        int numeroConta = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        Double saldo = 237.48;
            
        // Criando o objeto Scanner
            
            Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

               // Solicitando os dados ao usuario 
               System.out.println("Digite o numero da conta");
               int numero = scanner.nextInt();

              String comparacaoConta = numero==numeroConta ? "" :"desculpe não encontramos sua conta";
              System.out.println(comparacaoConta);

              System.out.println("Digite o numero da Agencia");
              String agenciaCliente = scanner.next();

              String comparacaoAgencia = agencia==agenciaCliente ? "" :"desculpe não encontramos sua conta";
              System.out.println(comparacaoAgencia);

                // Apresentando mensagem para o cliente 
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numeroConta +  " e seu saldo é de " + saldo + " reais e já está disponível para saque");


    }
}

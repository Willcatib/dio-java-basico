import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
     
        // Criando o objeto Scanner
            
            Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

               // Solicitando os dados ao usuario 
               
               System.out.println("Digite seu Nome");
              String nome = scanner.next();
              System.out.println("Digite seu Sobrenome");
              String sobrenome = scanner.next();

               System.out.println("Digite o numero da conta");
               int numero = scanner.nextInt();

              System.out.println("Digite o numero da Agencia");
              String agencia = scanner.next();

              System.out.println("Digite o seu saldo");
               Double saldo = scanner.nextDouble();


                // Apresentando mensagem para o cliente 
                System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero +  " e seu saldo é de " + saldo + " reais e já está disponível para saque");


    }
}

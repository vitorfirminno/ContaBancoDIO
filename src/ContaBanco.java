
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);

      
      System.out.println("Por favor, digite o número da Agência !");
      String numAgencia = teclado.next();

      System.out.println("Por favor, digite o numero da Conta !");
      int numConta = teclado.nextInt();

      System.out.println("Por favor, digite seu nome !");
      String nome = teclado.next();

      System.out.println("faça seu primeiro deposito para abrir a conta !");
      double saldo = teclado.nextDouble();

      String mensagem = "Olá ".concat(nome)
                               .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                               .concat(numAgencia)
                               .concat(", conta ")
                               .concat(String.valueOf(numConta))
                               .concat(" e seu saldo ")
                               .concat(String.valueOf(saldo))
                               .concat(" já está disponível para saque.");
        
        System.out.println(mensagem);
        teclado.close();

      



    }
}

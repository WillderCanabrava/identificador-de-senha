import java.util.Scanner;

public class PasswordIdentification {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String password = scanner.next();

        int count = 1;

        while (!password.equals("CRF1895") && count <= 2) {
            System.out.println("Digite novamente sua senha: \nTentativas restantes: " + (3 - count));
            password = scanner.next();
            count++;
        }

        if (password.equals("CRF1895")) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso bloqueado!");
        }

    }

}

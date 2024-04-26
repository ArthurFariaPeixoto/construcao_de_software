import java.util.Scanner;

public class TestarLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            Login loginController = new Login();
            loginController.fazer_login(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println(e);
        }
    }
}

import java.util.Objects;

public class Login {
    private final String usuario = "admin";
    private final String senha = "12345678";

    boolean fazer_login(String usuario, String senha) throws LoginInvalidoException {
        boolean isValidCredentials = Objects.equals(usuario, this.usuario) && Objects.equals(senha, this.senha);

        if (!isValidCredentials) {
            throw new LoginInvalidoException();
        }
        System.out.println("Login realizado com sucesso.");
        return true;
    }
}

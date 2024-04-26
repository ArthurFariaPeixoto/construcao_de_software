public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Acesso negado: login ou senha incorretas.");
    }
}

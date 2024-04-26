
public class Main3 {
    public static void main(String[] args) {

        Login login = new Login("Vitoria", "123456");

        try {
            System.out.println(login.fazerLogin("Vitoria", "123456"));

            System.out.println(login.fazerLogin("Vitoria", "12345"));

        } catch (LoginInvalidoException e) {
            System.out.println("Usuario ou senha invalidos");
        }
    }
}
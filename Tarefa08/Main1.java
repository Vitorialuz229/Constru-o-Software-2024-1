
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Insira o primeiro numero:");
            int num1 = scan.nextInt();

            System.out.println("Insira o segundo numero:");
            int num2 = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("O valor informado não é numérico");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por 0 não permitida");
        }
    }
}
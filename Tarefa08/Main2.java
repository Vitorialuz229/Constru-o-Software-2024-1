
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        try {
            do {
                System.out.println("Digite um numero: ");
                numero = scan.nextInt();
                
            } while (numero != 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice acima do tamanho do array");

        } catch (InputMismatchException e) {
            System.out.println("Valor informado não é numérico. ");

        }
    }
}
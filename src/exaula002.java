import java.util.Scanner;

public class exaula002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Não negativo");
        }
        else {
            System.out.println("Negativo");
        }


    }


}

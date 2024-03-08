import java.util.Scanner;

public class exaula004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Valor 1: ");
        a= sc.nextInt();
        System.out.print("Valor 2: ");
        b= sc.nextInt();


        if (a % b== 0 || b % a == 0 ) {
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
        sc.close();
        }
    }


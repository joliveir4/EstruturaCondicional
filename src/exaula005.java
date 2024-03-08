import java.util.Scanner;

public class exaula005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int hr1= sc.nextInt();

        System.out.print("Hora final:");
        int hr2= sc.nextInt();
        int diferenca;

         if (hr2>= hr1 ){
             diferenca = hr2 - hr1;
         }
          else if (hr1 + hr2 == 0) {
             diferenca = 24;
         }
           else{
               diferenca = (24-hr1) +hr2;
         }
        System.out.println("o jogo durou: "+ diferenca+ " horas");



    }
}

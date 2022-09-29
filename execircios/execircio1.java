package execircios;
import java.util.Scanner;
public class execircio1 {

    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);

        int A,B,C,D,Total;
        System.out.println("Digite valores para A, B, C e D.");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        Total = (A+B+C+D);

        System.out.println("A Soma de " +A+ " + " +B+" + " +C+" + "+D+ " = " +Total);

    }
}

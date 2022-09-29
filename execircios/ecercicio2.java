package execircios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ecercicio2 {

    public static void main(String[]args){

        Scanner Ler = new Scanner(System.in);
        double Nota1,Nota2,Nota3,Media;

        System.out.println("Informe as notas dos alunos:");
        Nota1=Ler.nextDouble();
        Nota2=Ler.nextDouble();
        Nota3=Ler.nextDouble();

        Media=(Nota1+Nota2+Nota3)/3;
        System.out.printf("A media das notas são " + Media);
    }
}

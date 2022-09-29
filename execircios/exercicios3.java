package execircios;
import java.util.Scanner;

public class exercicios3 {

    public static void main(String[]args){

        Scanner Ler = new Scanner(System.in);

        double Salario_Inicial,Novo_Salario;

        System.out.println("Informe o salario: ");
        Salario_Inicial= Ler.nextDouble();

        Novo_Salario=Salario_Inicial*0.25;

        System.out.printf("O novo salario: f.2" + Novo_Salario);
    }
}

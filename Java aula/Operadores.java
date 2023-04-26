//importando o Scanner
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4;
        double div, soma, subtracao, multi;
        int resto = 30;
        System.out.println("Resto da divisão: "+resto%4);
        System.out.println("Resto da divisão 2: "+resto%5);
        System.out.println("Digite um valor: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o 2º valor: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o 3º valor: ");
        n3 = sc.nextDouble();
        System.out.println("Digite o 4º valor: ");
        n4 = sc.nextDouble();
        //Operadores Aritiméticos -> +, -, *, /
        soma = (n1+n2+n3+n4);
        System.out.println("soma dos valores: "+soma);
        subtracao = (n1-n2-n3-n4);
        System.out.println("subtração dos valores: "+subtracao);
        multi = (n1*n2*n3*n4);
        System.out.println("multiplicção dos valores: "+multi);
        div = (n1/n2/n3/n4);
        System.out.println("multiplicção dos valores: "+div);
        sc.close();
    }
}
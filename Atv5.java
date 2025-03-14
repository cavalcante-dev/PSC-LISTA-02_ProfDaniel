import java.util.Scanner;

public class Atv5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valorAlemanha, valorPortugal, valorItalia, valorTotal;
        int pessoasAlemanha, pessoasPortugal, pessoasItalia, pessoasTotal;

        System.out.println("Digite o valor individual da viagem da Alemanha: ");
        valorAlemanha = sc.nextDouble();
        System.out.println("Digite quantas pessoas vão para a viagem da Alemanha: ");
        pessoasAlemanha = sc.nextInt();

        System.out.println("Digite o valor individual da viagem da Portugal: ");
        valorPortugal = sc.nextDouble();
        System.out.println("Digite quantas pessoas vão para a viagem da Portugal: ");
        pessoasPortugal = sc.nextInt();

        System.out.println("Digite o valor individual da viagem da Itália: ");
        valorItalia = sc.nextDouble();
        System.out.println("Digite quantas pessoas vão para a viagem da Itália: ");
        pessoasItalia = sc.nextInt();        

        pessoasTotal = pessoasItalia + pessoasPortugal + pessoasAlemanha;
        valorTotal = (pessoasItalia * valorItalia) + (valorPortugal * pessoasPortugal) + (pessoasAlemanha * valorAlemanha);

        // Final do código pendendo ajustes. 

        System.out.printf("%2f", "O valor total da viagem para ", pessoasTotal, " pessoas é de ", valorTotal, ".");

        sc.close();

    }

}

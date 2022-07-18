package dio.condicional.fluxo;

import java.util.Scanner;

public class Estruturas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mes;
        System.out.println("Digite o número do mês: ");
        mes = scan.nextInt();
        nomeMes(mes);
        ferias(mes);

        String dia;
        System.out.println("Digite um dia da semana: ");
        dia = scan.next();
        semana(dia);

        int i;
        System.out.println("Escolha um número de 1 a 5: ");
        i = scan.nextInt();
        teste(i);


    }

    public static void nomeMes(int mes) {

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novemebro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês Inválido");
        }
        ;
    }

    /*public static void ferias(String mesFerias ){

        if (mesFerias == "janeiro" || mesFerias == "julho" || mesFerias == "dezembro") {
            System.out.println("Férias");
        } else {
            System.out.println("Aula");
        }
    } */

    public static void ferias(int mes ) {

        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Férias");
        } else {
            System.out.println("Aula");
        }
    }

    public static void semana(String dia) {

        switch (dia) {
            case "domingo" :
            case "Domingo":
                System.out.println(1);
                break;
            case "segunda":
            case "Segunda":
                System.out.println(2);
                break;
            case "terça":
            case "Terça":
                System.out.println(3);
                break;
            case "quarta":
            case "Quarta":
                System.out.println(4);
                break;
            case "quinta":
            case "Quinta":
                System.out.println(5);
                break;
            case "sexta":
            case "Sexta":
                System.out.println(6);
                break;
            case "sábado":
            case "Sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia inválido");
        }
    }

    public static void teste(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }
    }
}

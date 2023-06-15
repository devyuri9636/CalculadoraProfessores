import java.util.Scanner;

public class App {
    private static int valorHr;
    private static int horaTrab;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String professor1 = nomeProf(sc, 1);
        int regimeProf1 = Regime(sc, professor1);

        if (regimeProf1 == 1) {
            int salarioCLT = SalarioCLT(sc, professor1);
            System.out.println("O regime do professor " + professor1 + " é CLT e seu salário é: " + salarioCLT);
        } else if (regimeProf1 == 2) {
            int contrato = Contrato(sc, professor1);
            System.out.println("O regime do professor " + professor1 + " é PJ e seu contrato é de: " + contrato);
        } else if (regimeProf1 == 3) {
            int salarioHorista = SalarioHorista(sc, professor1);
            System.out.println("O regime do professor " + professor1 + " é Horista e seus ganhos são: " + salarioHorista);
        }

        String professor2 = nomeProf(sc, 2);
        int regimeProf2 = Regime(sc, professor2);

        if (regimeProf2 == 1) {
            int salarioCLT = SalarioCLT(sc, professor2);
            System.out.println("O regime do professor " + professor2 + " é CLT e seu salário é: " + salarioCLT);
        } else if (regimeProf2 == 2) {
            int contrato = Contrato(sc, professor2);
            System.out.println("O regime do professor " + professor2 + " é PJ e seu contrato é de: " + contrato);
        } else if (regimeProf2 == 3) {
            int salarioHorista = SalarioHorista(sc, professor2);
            System.out.println("O regime do professor " + professor2 + " é Horista e seus ganhos são: " + salarioHorista);
        }

        String professor3 = nomeProf(sc, 3);
        int regimeProf3 = Regime(sc, professor3);

        if (regimeProf3 == 1) {
            int salarioCLT = SalarioCLT(sc, professor3);
            System.out.println("O regime do professor " + professor3 + " é CLT e seu salário é: " + salarioCLT);
        } else if (regimeProf3 == 2) {
            int contrato = Contrato(sc, professor3);
            System.out.println("O regime do professor " + professor3 + " é PJ e seu contrato é de: " + contrato);
        } else if (regimeProf3 == 3) {
            int salarioHorista = SalarioHorista(sc, professor3);
            System.out.println("O regime do professor " + professor3 + " é Horista e seus ganhos são: " + salarioHorista);
        }

        sc.close();

        
    }



    private static String nomeProf(Scanner sc, int professorNum) {
        System.out.println("Digite o nome do professor " + professorNum + ":");
        return sc.next();
    }

    private static int Regime(Scanner sc, String professor) {
        System.out.println("Digite o regime do professor " + professor + ", as opções são:\n1 para CLT\n2 para PJ\n3 para Horista.");
        return sc.nextInt();
    }

    private static int SalarioCLT(Scanner sc, String professor) {
        System.out.println("Digite o salário mensal do professor " + professor);
        return sc.nextInt();
    }

    private static int Contrato(Scanner sc, String professor) {
        System.out.println("Digite o valor do contrato do professor " + professor);
        return sc.nextInt();
    }

    private static int SalarioHorista(Scanner sc, String professor) {
        System.out.println("Digite o número de horas trabalhadas e o valor da hora do professor " + professor);
        int horaTrab = sc.nextInt();
        int valorHr = sc.nextInt();
        return horaTrab * valorHr;
    }
}


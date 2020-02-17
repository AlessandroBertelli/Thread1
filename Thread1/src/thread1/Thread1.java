package thread1;

import java.util.Scanner;

public class Thread1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ThreadBanca contoPizzi = new ThreadBanca(creaContoCorrente(), setNomeCliente());

        while (true) {
            switch (sceltaUtente()) {
                case 1:
                    System.out.println("\nInserisci l'importo del deposito:");
                    contoPizzi.deposito(input.nextFloat());
                    contoPizzi.stampaSaldo();
                    break;
                case 2:
                    System.out.println("\nInserisci l'importo del prelievo:");
                    contoPizzi.prelievo(input.nextFloat());
                    contoPizzi.stampaSaldo();
                    break;
                default:
                    System.out.println("Inserito numero non valido riprova!");
            }

        }

    }

    public static int sceltaUtente() {
        System.out.println("\nInserisca il numero associato alla funzione desiderata: ");
        System.out.println("1 - Per depositare nel tuo conto corrente");
        System.out.println("2 - Per prelevare dal tuo conto corrente");
        return input.nextInt();
    }

    public static ContoCorrente creaContoCorrente() {
        System.out.print("Inserisci l'importo iniziale del conto corrente: ");
        return new ContoCorrente(input.nextFloat());
    }

    public static String setNomeCliente() {
        System.out.print("Inserisci il nome del proprietario del conto: ");
        
        String nome = input.nextLine();
        System.out.println("Nome: "+nome+"\n");
        return nome;
    }
}

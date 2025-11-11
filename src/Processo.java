import java.util.Scanner;

public class Processo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Sistema di produzione di orologi meccanici:");
        System.out.print("Quanti orologi meccanici vuoi produrre? ");
        int quantita = input.nextInt();

        for (int i = 1; i <= quantita; i++) {
            System.out.println("\n PRODUZIONE OROLOGIO N° " + i );

            // Creazione dei due thread
            Assemblaggio assemblaggio = new Assemblaggio(i);
            Controllo controllo = new Controllo(i);

            // Avvio in parallelo
            assemblaggio.start();
            controllo.start();

            try {
                // Il processo padre attende che entrambi i thread terminino
                assemblaggio.join();
                controllo.join();
            } catch (InterruptedException e) {
                System.out.println(" Errore durante l'attesa dei thread: " + e.getMessage());
            }

            System.out.println(" Orologio n " + i + " completato.");
        }

        System.out.println("\n Tutti gli orologi sono stati prodotti.");
        input.close();
    }
}

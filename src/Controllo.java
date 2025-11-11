// Classe Controllo che rappresenta un thread che simula il processo
// di controllo di un orologio meccanico


class Controllo extends Thread {

    private int numeroOrologio;

    public Controllo(int numeroOrologio) {
        this.numeroOrologio = numeroOrologio;
    }

    public void run() {
        try {
            System.out.println(" Controllo Qualità: avvio del controllo qualità.");
            Thread.sleep(1000);
            System.out.println(" Controllo Qualità: verifica precisione movimento delle lancette.");
            Thread.sleep(1500);
            System.out.println(" Controllo: pulizia.");
            Thread.sleep(1500);
            System.out.println(" Controllo Qualità completato.");
        } catch (InterruptedException e) {
            System.out.println(" Controllo Qualità interrotto.");
        }
    }
}
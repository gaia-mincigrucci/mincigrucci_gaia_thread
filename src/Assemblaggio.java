// Classe Assemblaggio che rappresenta un thread che simula il processo
// di assemblaggio di un orologio meccanico
class Assemblaggio extends Thread {
     private int numeroOrologio;

     public Assemblaggio(int numeroOrologio) {
         this.numeroOrologio = numeroOrologio;
     }
    @Override
    public void run() {
        try {
            System.out.println(" Assemblaggio: inizio montaggio componenti meccanici.");
            Thread.sleep(1500);
            System.out.println(" Assemblaggio: montaggio ingranaggi.");
            Thread.sleep(1500);
            System.out.println(" Assemblaggio: montaggio quadrante e lancette.");
            Thread.sleep(1500);
            System.out.println(" Assemblaggio completato.");
        } catch (InterruptedException e) {
            System.out.println(" Assemblaggio interrotto.");
        }
    }
}
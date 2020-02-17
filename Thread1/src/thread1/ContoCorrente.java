package thread1;

public class ContoCorrente {

    private float saldo;

    public ContoCorrente(float saldo) {
        this.saldo = saldo;
        System.out.println("Conto corrente creato con saldo = "+this.saldo);
    }

    public void prelievo(float soldi) {
        saldo -= soldi;
    }

    public void deposito(float soldi) {
        saldo += soldi;
    }

    public void stampaSaldo() {
        System.out.println("Saldo attuale: " + this.saldo);
    }

}

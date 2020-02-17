package thread1;

public class ThreadBanca {
    
    private ContoCorrente cc;
    private String nomeCliente;

    public ThreadBanca(ContoCorrente cc, String nomeCliente) {
        this.cc = cc;
        this.nomeCliente = nomeCliente;
    }         
    
    public void deposito(float soldi) {
        cc.deposito(soldi);
    }
    
    public void prelievo(float soldi) {
        cc.prelievo(soldi);
    }
    
    public void stampaSaldo() {
        cc.stampaSaldo();
    }
    
}

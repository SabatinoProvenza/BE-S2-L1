package es3;

import es3.exception.BancaException;

public class ContoOnLine extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti()
                + " - Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile: " + maxPrelievo);
    }


    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);
    }

}


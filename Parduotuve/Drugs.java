package lt.andzej.Parduotuve;

public class Drugs extends Items implements Franks {
    public Drugs() {
    }

    public Drugs(String name, double priceNet) {
        super(name, priceNet);
        this.setVat(9);
    }
}


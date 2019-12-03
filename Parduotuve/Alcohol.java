package lt.andzej.Parduotuve;

public abstract class Alcohol extends Items implements Franks {
double volume;
double excise;

// PARENT CLASS FOR ALCOHOL ITEMS

    public Alcohol(String name, double priceNet, double volume, double liters) {
        super(name, priceNet);
        this.volume = volume;
        this.excise = getExcise();
        super.setVat(21);
    }

    public void setExcise(){
    }

    public double getExcise() {
        return this.excise;
    }

    public Alcohol() {
        super();
    }

    public Alcohol(int vat, String name, double priceNet) {
        super(vat, name, priceNet);
    }

    public Alcohol(String name, double priceNet) {
        super(name, priceNet);
    }

    @Override
    public double getPriceNet() {
        return super.getPriceNet();
    }

    @Override
    public void setVat(int vat) {
        super.setVat(vat);
    }

    @Override
    public int getVat() {
        return super.getVat();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPriceBrutto() {
        return super.getPriceBrutto();
    }

    @Override
    public double getPriceNetFranks() {
        return super.getPriceNetFranks();
    }

    @Override
    public double getPriceBruttoFranks() {
        return super.getPriceBruttoFranks();
    }

    @Override
    public String toString() {
        return super.toString() +
                " Alcohol Drink: " +"\n" +
                " Volume: " + volume+"\n" +
                " Excise: " + getExcise() +"\n" ;
    }
}

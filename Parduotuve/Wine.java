package lt.andzej.Parduotuve;

public class Wine extends Alcohol {
    public Wine(String name, double priceNet, double volume, double liters) {
        super(name, priceNet, volume, liters);
        this.setExcise();
    }

    @Override
    public void setExcise(){
        if (volume < 8.5) {
            this.excise = 0.28;
        } else if ( volume >= 8.5) {
            this.excise = 0.72;
        }
    }

    public Wine() {
    }

    public Wine(int vat, String name, double priceNet) {
        super(vat, name, priceNet);
    }

    public Wine(String name, double priceNet) {
        super(name, priceNet);
    }
    @Override
    public String toString() {
        return
                " Wine: " +"\n" +
                " VAT tax is: " + getVat() + " %"+ "\n" +
                " Name of the product: " + getName() +  "\n"  +
                " PriceNet in EUR: " + getPriceNet()+  "\n"  +
                " PriceBrutto in EUR: " + getPriceBrutto() + "\n"  +
                " PriceNet in Swiss Franks: " +getPriceNetFranks() + "\n"  +
                " PriceBrutto in Swiss Franks: " + getPriceBruttoFranks() + "\n"+ " Volume: " + volume+"\n" +
                " Excise: " + getExcise() +"\n";
    }
}

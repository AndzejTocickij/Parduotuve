package lt.andzej.Parduotuve;

public abstract class Items implements Franks {
   private int vat;
   private String name;
   private double priceNet;

   // PARENT CLASS FOR ALL OTHER ITEMS

   public Items(){
   }

   public Items(int vat, String name, double priceNet){
       this.vat = vat;
       this.name = name;
       this.priceNet = priceNet;
   }

    public Items(String name, double priceNet) {
       this.name = name;
       this.priceNet = priceNet;
    }

    public double getPriceNet() {
        return priceNet;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public int getVat() {
        return vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceBrutto(){
       return (getPriceNet() / 100 *getVat() ) + getPriceNet() ;
    }

    public double getPriceNetFranks(){
        return getPriceNet() * frankToEurRatio;
    }
    public double getPriceBruttoFranks(){
        return getPriceBrutto() * frankToEurRatio;
    }

    @Override
    public String toString() {
        return
                " VAT tax is: " + vat + " %"+ "\n" +
                " Name of the product: " + name +  "\n"  +
                " PriceNet in EUR: " + priceNet + "\n"  +
                " PriceBrutto in EUR: " + getPriceBrutto() + "\n"  +
                " PriceNet in Swiss Franks: " +getPriceNetFranks() + "\n"  +
                " PriceBrutto in Swiss Franks: " + getPriceBruttoFranks() + "\n";
    }
}


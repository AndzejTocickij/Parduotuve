package lt.andzej.Parduotuve;

public class AlcoholDrink extends Alcohol{

    public AlcoholDrink(String name, double priceNet, double volume, double liters) {
        super(name, priceNet, volume, liters);
        this.setExcise();
    }

    @Override
        public void setExcise(){
       if (volume < 15) {
           this.excise = 0.89;
       } else if ( volume >= 15) {
           this.excise = 1.26;
       }
    }

    public AlcoholDrink() {
        super();
    }

    public AlcoholDrink(int vat, String name, double priceNet) {
        super(vat, name, priceNet);
    }

    public AlcoholDrink(String name, double priceNet) {
        super(name, priceNet);
    }


    public String toString() {
        return super.toString() ;

    }
}

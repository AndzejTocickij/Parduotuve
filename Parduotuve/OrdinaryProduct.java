package lt.andzej.Parduotuve;

public class OrdinaryProduct extends Items {
    public OrdinaryProduct() {
    }

    public OrdinaryProduct(String name, double priceNet) {
        super(name, priceNet);
        super.setVat(21);

    }

}

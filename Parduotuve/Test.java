package lt.andzej.Parduotuve;

public class Test {

    public static void main(String[] args) {
	// Test class to test objects
        OrdinaryProduct book = new OrdinaryProduct("Book",15);
        System.out.println(book.toString());

        AlcoholDrink vodka = new AlcoholDrink("Vodka",20,26,10);
        System.out.println(vodka.toString());

        AlcoholDrink jin = new AlcoholDrink("Jin",9,14,10);
        System.out.println(vodka.toString());

        Wine redWine = new Wine("Red Wine", 49,7.5,1);
        System.out.println(redWine.toString());

        Wine whiteWine = new Wine("White Wine", 35,8.5,1);
        System.out.println(whiteWine.toString());

        Drugs aspirin = new Drugs("Aspirinas",2.49);
        System.out.println(aspirin.toString());
    }
}

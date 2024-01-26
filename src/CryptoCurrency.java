public abstract class CryptoCurrency {
    private String name;
    private double price;
    private static long cirulatingSupply;
    private static long totalSold = 0;
    public  CryptoCurrency(String name,double price,long circ){
        this.name = name;
        this.price = price;
        cirulatingSupply = circ;

    }
public static double calculatePrice(CryptoCurrency[] currency) {
    double result = 0;
    for (CryptoCurrency curr : currencies) {
        result += curr.price * cirulatingSupply;

    }
    return result;
    }
}
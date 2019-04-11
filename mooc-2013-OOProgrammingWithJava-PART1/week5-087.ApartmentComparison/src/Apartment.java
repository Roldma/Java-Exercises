
public class Apartment {

    private final int rooms;
    private final int squareMeters;
    private final int pricePerSquareMeter;
    private final int price;
    

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = squareMeters * pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherA) {
        return squareMeters > otherA.squareMeters;
    }
    
    public int priceDifference(Apartment otherA) {
        
        int otherPrice = otherA.squareMeters * otherA.pricePerSquareMeter;
        
        return Math.abs(price - otherPrice);
    }
    
    
    public boolean moreExpensiveThan(Apartment otherA) {
        int otherPrice = otherA.squareMeters * otherA.pricePerSquareMeter;
        
        return price > otherPrice;
    }
}

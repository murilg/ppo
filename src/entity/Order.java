package entity;

public class Order {
    private int ID;
	private int buyerID;
	private Delivery deliveryMethod; // способ доставки (самовывоз/курьером)

    public int getID() {
        return ID;
    }
    public int getBuyerID() {
        return buyerID;
    }
    public Delivery getDeliveryMethod() {
        return deliveryMethod;
    }
}

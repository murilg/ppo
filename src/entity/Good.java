package entity;

public class Good {
    private int ID; // он же артикул
    private String name;
    private String description;
    private String specifications; // характеристики
    private Category category;
    private float price;
    private int amount;

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getSpecifications() {
        return specifications;
    }
    public Category getCategory() {
        return category;
    }
    public float getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }
}

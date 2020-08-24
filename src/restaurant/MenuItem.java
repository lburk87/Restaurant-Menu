package restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded = Calendar.getInstance().getTime();
    public boolean newItem = false;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public void setDateAdded(Date aDateAdded) {
        dateAdded = aDateAdded;
    }

}



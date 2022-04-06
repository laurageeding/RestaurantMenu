package restaurant;

public class MenuItem {

    private String description;
    private double price;
    private String category;
    private boolean isNewItem;

    public MenuItem(String description, double price, String category, boolean newItem) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNewItem = newItem;
    }

    @Override
    public String toString() {
        return ("\n Description: "+this.getDescription() +
                "\n Price: "+ this.getPrice() +
                "\n Category: "+ this.getCategory() +
                "\n New Item : " + this.isNewItem());
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String isNewItem() {
        if (isNewItem == true) {
            return "New Item!";
        } else {
            return " ";
        }
    }
        public void setNewItem(boolean aNewItem) {
            isNewItem = aNewItem;
        }
    }

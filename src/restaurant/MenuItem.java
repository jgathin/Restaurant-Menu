package restaurant;


import java.util.ArrayList;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private int price;
    private boolean newness;
    private boolean menuAdd;
    ArrayList<MenuItem> appetizers = new ArrayList<>();
    ArrayList<MenuItem> mainCourse = new ArrayList<>();
    ArrayList<MenuItem> dessert = new ArrayList<>();

    public MenuItem(String name, String description, String category, int price, boolean
            newness, boolean menuAdd) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newness = true;
        this.menuAdd = menuAdd;

//        void addToList() {
//            if(menuAdd) {
    }

    public void setDescription(String aDescription) { this.description = aDescription; }
    public void setPrice(int aPrice) { this.price = aPrice; }
    public void setCategory( String aCategory) { this.category = aCategory; }
    public void addAppItems(MenuItem item) {
        appetizers.add(item);
    }
    public void addMainItems(MenuItem item) {
        mainCourse.add(item);
    }
    public void addDesItems(MenuItem item) {
        dessert.add(item);
    }
    public void setItemNormal(boolean item) {
        this.newness = false;
    }
    public void removeAppItems(MenuItem item) {
        appetizers.remove(item);
    }
    public void removeMainItems(MenuItem item) {
        mainCourse.remove(item);
    }
    public void removeDesItems(MenuItem item) {
        dessert.remove(item);
    }


    MenuItem macNCheese = new MenuItem("Macaroni & Cheese", null, "Main Course", 14, true);
    MenuItem pizza = new MenuItem("Pizza", null, "Main Course", 11, true);
}

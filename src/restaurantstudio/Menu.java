package restaurantstudio;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;

//    public ArrayList<MenuItem> getMenu () {
//        return menu;
//    }
//    public Menu(ArrayList<MenuItem> menu) {
//        this.menu = menu;
//    }
//    public void setMenu(ArrayList<MenuItem> menu) {
//        this.menu = menu;
//    }


    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
}

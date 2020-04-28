package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public ArrayList<String> items = new ArrayList<>();
    protected Date lastUpdated = new Date();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public Menu(ArrayList<String> items) {
        this.items = items;
    }
}

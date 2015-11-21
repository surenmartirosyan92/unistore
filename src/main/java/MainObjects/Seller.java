package MainObjects;

import java.util.ArrayList;

/**
 * Created by Suren Martirosyan on 17.11.2014.
 *
 * @author Suren Martirosyan
 */
public class Seller implements ISeller {

    private Integer id;
    private String address;
    private String name;
    private ArrayList<Item> items;

    Seller() {
    }

    Seller(Integer id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public void addItemForSale(Item item) {
        items.add(item);
    }

    @Override
    public void saleItem(Item item) {
        for (int i = 0; i < items.size(); ++i) {
            if (items.get(i).getId().equals(item.getId())) {
                items.remove(i);
                break;
            }
        }
    }
}

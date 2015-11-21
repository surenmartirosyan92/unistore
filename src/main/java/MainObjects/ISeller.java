package MainObjects;

import java.util.ArrayList;

/**
 * Created by Suren Martirosyan on 17.11.2014.
 *
 * @author Suren Martirosyan
 */
public interface ISeller {
    Integer getId();

    String getAddress();

    String getname();

    ArrayList<Item> getItems();

    void addItemForSale(Item item);

    void saleItem(Item item);
}

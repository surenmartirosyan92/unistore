package MainObjects;

import java.math.BigDecimal;

/**
 * Created by Suren Martirosyan on 17.11.2014.
 *
 * @author Suren Martirosyan
 */
public class Item {
    private Integer id;
    private BigDecimal price;
    private String name;
    private Integer count;

    public Item(Integer id, BigDecimal price, String name, Integer count) {
        this.id = id;
        this.name = name;
        this.setPrice(price);
        this.setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    Integer getId() {
        return id;
    }

    BigDecimal getPrice() {
        return price;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }
}

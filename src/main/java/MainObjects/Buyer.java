package MainObjects;

/**
 * Created by user on 20.12.2014.
 */
public class Buyer {
    private Integer id;
    private String name;
    private String address;

    public Buyer(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

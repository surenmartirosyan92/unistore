package MainObjects;

/**
 * Created by Suren Martirosyan on 16.12.2014.
 * @author Suren Martirosyan
 */
public class Category {
    private String name;
    private Integer id;


    public Category(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

}

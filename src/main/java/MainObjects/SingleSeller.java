package MainObjects;

/**
 * Created by Suren Martirosyan on 18.11.2014.
 *
 * @author Suren Martirosyan
 */
public class SingleSeller extends Seller {

    private String secondName;

    SingleSeller(Integer id, String address, String name, String secondName) {
        super(id, address, name);
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static void main(String args[]) {
        Seller a = new SingleSeller(1, "asdf", "Suro", "Martirosyan");
        System.out.println(a.getname());
        System.out.println(((SingleSeller) a).getSecondName());
    }
}
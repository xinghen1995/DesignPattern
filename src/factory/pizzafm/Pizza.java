package factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("Preparing " + name);
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("----" + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings)
            display.append(topping + "\n");
        return display.toString();
    }
}


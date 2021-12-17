package Models;

import Enums.Material;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

public class BarStool extends Chair{
    @Expose(serialize = false)
    private final Gson gson;
    public BarStool(String manufacturer, double price, Material material, double height, double width, double depth) {
        super(manufacturer, price, material, height, width, depth);
        gson = new Gson();
    }

    @Override
    public void print() {
        System.out.println(gson.toJson(this));
    }
}

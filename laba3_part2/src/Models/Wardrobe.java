package Models;

import Base.IFurniture;
import Enums.Material;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

public class Wardrobe implements IFurniture {
    private final String manufacturer;
    private final double price;
    private final Material material;
    private final int crates;
    private final double workingSquare;
    @Expose(serialize = false)
    private final Gson gson;
    public Wardrobe(String manufacturer, double price, Material material, int crates, double workingSquare) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
        this.crates = crates;
        this.workingSquare = workingSquare;

        gson = new Gson();
    }
    @Override
    public void print() {
        System.out.println(gson.toJson(this));
    }
}

package Base;

import Enums.Material;

public class Furniture {
    public String manufacturer;
    public double price;
    public Material material;

    public Furniture(String manufacturer, double price, Material material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }
}

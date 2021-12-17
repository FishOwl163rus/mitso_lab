package Models;

import Base.IFurniture;
import Enums.Material;

public abstract class Chair implements IFurniture {
    String manufacturer;
    double price;
    Material material;
    double height;
    double width;
    double depth;

    public Chair(String manufacturer, double price, Material material, double height, double width, double depth) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Chair(String manufacturer, double price, Material material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }
}

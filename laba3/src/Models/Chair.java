package Models;

import Base.Furniture;
import Enums.Material;

public class Chair extends Furniture {
    boolean hasHeightConfigurer;
    public Chair(String manufacturer, double price, Material material, boolean hasHeightConfigurer) {
        super(manufacturer, price, material);
        this.hasHeightConfigurer = hasHeightConfigurer;
    }
}

package Models;

import Base.Furniture;
import Enums.Material;

public class Cupboard extends Furniture {
    private final double height;
    private final double width;
    private final double depth;

    public Cupboard(String manufacturer, double price, Material material, double height, double width, double depth) {
        super(manufacturer, price, material);

        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}

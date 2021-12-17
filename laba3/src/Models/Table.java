package Models;

import Base.Furniture;
import Enums.Material;

public class Table extends Furniture {
    private final int crates;
    private final double workingSquare;
    public Table(String manufacturer, double price, Material material, int crates, double workingSquare) {
        super(manufacturer, price, material);
        this.crates = crates;
        this.workingSquare = workingSquare;
    }
}

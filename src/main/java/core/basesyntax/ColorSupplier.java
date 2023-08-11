package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colour.values().length);
        return (Colour.values()[index]).toString();
    }
}

package core.basesyntax.supplier;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int randomVerge = random.nextInt(Color.values().length);
        return Color.values()[randomVerge];
    }
}

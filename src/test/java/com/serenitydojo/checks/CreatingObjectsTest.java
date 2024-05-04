package com.serenitydojo.checks;

import com.serenitydojo.Dog;
import org.junit.Assert;
import org.junit.Test;

public class CreatingObjectsTest {

    @Test
    public void hear_dog() {

        Assert.assertEquals(Dog.makeNoise(), "Woof");
    }

    @Test
    public void is_fed() {

        Dog spot = new Dog("Spot", "Ball", 3);
        Dog fido = new Dog("Fido", "Ball", 3);

        fido.feed();

        Assert.assertTrue(fido.hasBeenFed());
        Assert.assertFalse(spot.hasBeenFed());
    }
}

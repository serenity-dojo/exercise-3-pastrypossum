package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void hear_dog() {
        Dog fido = new Dog("Fido", "Ball", 3);

        Assert.assertEquals(fido.makeNoise(), "Woof");
    }

    @Test
    public void is_fed() {
        Dog fido = new Dog("Fido", "Ball", 3);
        fido.feed();

        Assert.assertEquals(fido.hasBeenFed(), true);
    }
}

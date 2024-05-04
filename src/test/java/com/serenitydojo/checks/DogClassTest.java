package com.serenitydojo.checks;

import com.serenitydojo.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogClassTest {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void theDogClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Dog")).isNotNull();
    }

    @Test
    public void theDogClassShouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("toy").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }
}

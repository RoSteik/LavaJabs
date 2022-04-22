package iot.lviv.ua.models;

import static org.junit.jupiter.api.Assertions.*;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class FruitBoxTest {

    @Test
    public void toStringTest(){
        FruitBox actualFruitBox1 =  new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 50));
        FruitBox actualFruitBox2 = new FruitBox(new Citrus("Orange", "orange", RipeningSeason.AUTUMN, 52));
        FruitBox actualFruitBox3 = new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 47));
        FruitBox actualFruitBox4 = new FruitBox(new Citrus("Lime", "green", RipeningSeason.SUMMER, 55));

        assertEquals("Fruit - Strawberry, price - 50", actualFruitBox1.toString());
        assertEquals("Fruit - Orange, price - 52", actualFruitBox2.toString());
        assertEquals("Fruit - Blackberry, price - 47", actualFruitBox3.toString());
        assertEquals("Fruit - Lime, price - 55", actualFruitBox4.toString());

    }

    @Test
    public void equalsAndHashCodeTest() {
        EqualsVerifier.simple().forClass(FruitBox.class).verify();
    }
}
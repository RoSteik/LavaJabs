package iot.lviv.ua.models;

import static org.junit.jupiter.api.Assertions.*;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class FruitBoxTest {

    @Test
    public void toStringTest(){
        FruitBox actualFruitBox1 =  new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 50),23);
        FruitBox actualFruitBox2 = new FruitBox(new Citrus("Orange", "orange", RipeningSeason.AUTUMN, 52),24);
        FruitBox actualFruitBox3 = new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 47),25);
        FruitBox actualFruitBox4 = new FruitBox(new Citrus("Lime", "green", RipeningSeason.SUMMER, 55),20);

        assertEquals("FruitBox(fruit=Fruit(nameOfFruit=Strawberry, colourOfFruit=red, ripeningSeason=SUMMER, price=50), mass=23)", actualFruitBox1.toString());
        assertEquals("FruitBox(fruit=Fruit(nameOfFruit=Orange, colourOfFruit=orange, ripeningSeason=AUTUMN, price=52), mass=24)", actualFruitBox2.toString());
        assertEquals("FruitBox(fruit=Fruit(nameOfFruit=Blackberry, colourOfFruit=black, ripeningSeason=SUMMER, price=47), mass=25)", actualFruitBox3.toString());
        assertEquals("FruitBox(fruit=Fruit(nameOfFruit=Lime, colourOfFruit=green, ripeningSeason=SUMMER, price=55), mass=20)", actualFruitBox4.toString());

    }

    @Test
    public void equalsAndHashCodeTest() {
        EqualsVerifier.simple().forClass(FruitBox.class).verify();
    }
}
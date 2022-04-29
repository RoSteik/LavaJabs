package iot.lviv.ua;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitBoxTest {

    @Test
    public void toStringTest(){
        FruitBox actualFruitBox1 =  new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35);
        FruitBox actualFruitBox2 = new FruitBox("Grapefruit", "red", FruitBox.ripeningSeasonEnum.WINTER, 33);
        FruitBox actualFruitBox3 = new FruitBox("Lime", "green", FruitBox.ripeningSeasonEnum.SPRING, 56);
        FruitBox actualFruitBox4 = new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50);

        assertEquals("Orange, orange, Price per kilo - 35", actualFruitBox1.toString());
        assertEquals("Grapefruit, red, Price per kilo - 33", actualFruitBox2.toString());
        assertEquals("Lime, green, Price per kilo - 56", actualFruitBox3.toString());
        assertEquals("Strawberry, red, Price per kilo - 50", actualFruitBox4.toString());

    }

    @Test
    public void equalsAndHashCodeTest() {
        EqualsVerifier.simple().forClass(FruitBox.class).verify();
    }
}
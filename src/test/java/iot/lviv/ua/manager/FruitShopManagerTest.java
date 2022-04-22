package iot.lviv.ua.manager;

import iot.lviv.ua.models.Berry;
import iot.lviv.ua.models.Citrus;
import iot.lviv.ua.models.FruitBox;
import iot.lviv.ua.models.RipeningSeason;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FruitShopManagerTest {
    FruitShopManager manager = new FruitShopManager();

    List<FruitBox> fruitBoxes = new ArrayList<>(Arrays.asList(
            new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
            new FruitBox(new Citrus("Lime", "green", RipeningSeason.WINTER, 29)),
            new FruitBox(new Citrus("Grapefruit", "red", RipeningSeason.SPRING, 35)),
            new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32)),
            new FruitBox(new Berry("Blueberry", "blue", RipeningSeason.AUTUMN, 31)),
            new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38))
    ));

    @Test
    //in ascending order by colour
    public void sortSummerFruitsByColourTestInAscendingOrder(){
        List<FruitBox> actualFruitBoxSortedByColour = manager.sortSummerFruitsByColour(fruitBoxes,false);
        List<FruitBox> expectedFruitBoxSortedByColour = new ArrayList<>(Arrays.asList(
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38)),
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32))
        ));

        assertThat(actualFruitBoxSortedByColour, is(expectedFruitBoxSortedByColour));
    }

    @Test
    //in descending order by colour
    public void sortSummerFruitsByColourTestInDescendingOrder(){
        List<FruitBox> actualFruitBoxSortedByColour = manager.sortSummerFruitsByColour(fruitBoxes,true);
        List<FruitBox> expectedFruitBoxSortedByColour = new ArrayList<>(Arrays.asList(
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32)),
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38))
        ));

        assertThat(actualFruitBoxSortedByColour, is(expectedFruitBoxSortedByColour));
    }

    @Test
    //in ascending order by price
    public void sortSummerFruitsByPriceTestInAscendingOrder(){
        List<FruitBox> actualFruitBoxSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes,false);
        List<FruitBox> expectedFruitBoxSortedByPrice = new ArrayList<>(Arrays.asList(
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32)),
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38)),
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39))
        ));

        assertThat(actualFruitBoxSortedByPrice, is(expectedFruitBoxSortedByPrice));
    }

    @Test
    //in descending order by price
    public void sortSummerFruitsByPriceTestInDescendingOrder(){
        List<FruitBox> actualFruitBoxSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes,true);
        List<FruitBox> expectedFruitBoxSortedByPrice = new ArrayList<>(Arrays.asList(
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38)),
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32))
        ));

        assertThat(actualFruitBoxSortedByPrice, is(expectedFruitBoxSortedByPrice));
    }
}
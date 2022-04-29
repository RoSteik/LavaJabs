package iot.lviv.ua;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class FruitShopManagerTest {

    List<FruitBox> fruitBoxes = new ArrayList<>(Arrays.asList(
            new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35),
            new FruitBox("Grapefruit", "red", FruitBox.ripeningSeasonEnum.WINTER, 33),
            new FruitBox("Lime", "green", FruitBox.ripeningSeasonEnum.SPRING, 56),
            new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50),
            new FruitBox("Raspberry", "pink", FruitBox.ripeningSeasonEnum.AUTUMN, 78),
            new FruitBox("Blueberry", "blue", FruitBox.ripeningSeasonEnum.AUTUMN, 79),
            new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43)
    ));

    @Test
    //in ascending order by colour
    public void sortSummerFruitsByColourTestInAsc(){
        FruitShopManager manager = new FruitShopManager();

        List<FruitBox> actualFruitBoxSortedByColour = manager.sortSummerFruitsByColour(fruitBoxes,false);
        List<FruitBox> expectedFruitBoxSortedByColour = new ArrayList<>(Arrays.asList(
                new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43),
                new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35),
                new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50)
        ));

        assertThat(actualFruitBoxSortedByColour, is(expectedFruitBoxSortedByColour));

    }

    @Test
    //in descending order by colour
    public void sortSummerFruitsByColourTestInDesc(){
        FruitShopManager manager = new FruitShopManager();

        List<FruitBox> actualFruitBoxSortedByColour = manager.sortSummerFruitsByColour(fruitBoxes,true);
        List<FruitBox> expectedFruitBoxSortedByColour = new ArrayList<>(Arrays.asList(
                new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50),
                new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35),
                new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43)
        ));

        assertThat(actualFruitBoxSortedByColour, is(expectedFruitBoxSortedByColour));
    }

    @Test
    //in ascending order by price
    public void sortSummerFruitsByPriceTestInAsc(){
        FruitShopManager manager = new FruitShopManager();

        List<FruitBox> actualFruitBoxSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes,false);
        List<FruitBox> expectedFruitBoxSortedByPrice = new ArrayList<>(Arrays.asList(
                new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35),
                new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43),
                new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50)

        ));

        assertThat(actualFruitBoxSortedByPrice, is(expectedFruitBoxSortedByPrice));
    }

    @Test
    //in descending order by price
    public void sortSummerFruitsByPriceTestInDesc(){
        FruitShopManager manager = new FruitShopManager();

        List<FruitBox> actualFruitBoxSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes,true);
        List<FruitBox> expectedFruitBoxSortedByPrice = new ArrayList<>(Arrays.asList(
                new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50),
                new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43),
                new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35)
        ));

        assertThat(actualFruitBoxSortedByPrice, is(expectedFruitBoxSortedByPrice));
    }

}
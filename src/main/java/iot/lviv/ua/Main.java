package iot.lviv.ua;

// 45 Варіант, друга лаба по джаві
// 45 Варіант, третя лаба по джаві


import java.util.*;

public class Main {
    public static void main(String[] args) {
        FruitShopManager manager = new FruitShopManager();

        List<FruitBox> fruitBoxes = new ArrayList<>(Arrays.asList(
                new FruitBox("Orange", "orange", FruitBox.ripeningSeasonEnum.SUMMER, 35),
                new FruitBox("Grapefruit", "red", FruitBox.ripeningSeasonEnum.SUMMER, 33),
                new FruitBox("Lime", "green", FruitBox.ripeningSeasonEnum.SPRING, 56),
                new FruitBox("Strawberry", "red", FruitBox.ripeningSeasonEnum.SUMMER, 50),
                new FruitBox("Raspberry", "pink", FruitBox.ripeningSeasonEnum.AUTUMN, 78),
                new FruitBox("Blueberry", "blue", FruitBox.ripeningSeasonEnum.AUTUMN, 79),
                new FruitBox("Blackberry", "black",  FruitBox.ripeningSeasonEnum.SUMMER, 43)
        ));

        List<FruitBox> fruitBoxesListSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes, true);
        fruitBoxesListSortedByPrice.forEach(System.out::println);

        System.out.println();

        List<FruitBox> fruitBoxesListSortedByColour =  manager.sortSummerFruitsByColour(fruitBoxes, false);
        fruitBoxesListSortedByColour.forEach(System.out::println);
    }
}

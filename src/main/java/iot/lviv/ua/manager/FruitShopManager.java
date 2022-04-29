package iot.lviv.ua.manager;

import iot.lviv.ua.models.FruitBox;
import iot.lviv.ua.models.RipeningSeason;
import lombok.Getter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class FruitShopManager {
    public List<FruitBox> sortFruitsByColour(List<FruitBox> fruitBoxes, RipeningSeason ripeningSeason, boolean isDescendingOrderNeeded){
        List<FruitBox> sortedFruitBoxesInAscendingOrderByColour =  fruitBoxes.stream()
                .filter(fruitBox -> fruitBox.getFruit().getRipeningSeason() == ripeningSeason)
                .sorted(Comparator.comparing(fruitBox -> fruitBox.getFruit().getColourOfFruit()))
                .collect(Collectors.toList());

        if(isDescendingOrderNeeded){
            return sortedFruitBoxesInAscendingOrderByColour.stream()
                    .sorted( (fruitBox1,fruitBox2) -> fruitBox2.getFruit().getColourOfFruit().compareTo(fruitBox1.getFruit().getColourOfFruit()) )
                    .collect(Collectors.toList());
        }

        return sortedFruitBoxesInAscendingOrderByColour;
    }

    public List<FruitBox> sortFruitsByPrice(List<FruitBox> fruitBoxes,RipeningSeason ripeningSeason, boolean isDescendingOrderNeeded){
        List<FruitBox> sortedFruitBoxesInAscendingOrderByPrice =  fruitBoxes.stream()
                .filter(fruitBox -> fruitBox.getFruit().getRipeningSeason() == ripeningSeason)
                .sorted(Comparator.comparing(fruitBox -> fruitBox.getFruit().getPrice()))
                .collect(Collectors.toList());

        if (isDescendingOrderNeeded) {
            Collections.reverse(sortedFruitBoxesInAscendingOrderByPrice);
        }

        return sortedFruitBoxesInAscendingOrderByPrice;

    }

}
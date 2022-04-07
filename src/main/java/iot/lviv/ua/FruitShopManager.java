package iot.lviv.ua;

import lombok.Getter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class FruitShopManager {
    public List<FruitBox> sortSummerFruitsByColour(List<FruitBox> fruitBoxes, boolean isDescendingOrderNeeded){
        if(isDescendingOrderNeeded == true){
            return fruitBoxes.stream()
                    .filter(fruit -> fruit.getRipeningSeason() == FruitBox.ripeningSeasonEnum.SUMMER)
                    .sorted(Comparator.comparing(FruitBox::getColourOfFruitInBox).reversed())
                    .collect(Collectors.toList());
        }
        return fruitBoxes.stream()
                .filter(fruit -> fruit.getRipeningSeason() == FruitBox.ripeningSeasonEnum.SUMMER)
                .sorted(Comparator.comparing(FruitBox::getColourOfFruitInBox))
                .collect(Collectors.toList());
    }
    public List<FruitBox> sortSummerFruitsByPrice(List<FruitBox> fruitBoxes, boolean isDescendingOrderNeeded){
        if(isDescendingOrderNeeded == true){
            return fruitBoxes.stream()
                    .filter(fruit -> fruit.getRipeningSeason() == FruitBox.ripeningSeasonEnum.SUMMER)
                    .sorted(Comparator.comparing(FruitBox::getPrice).reversed())
                    .collect(Collectors.toList());
        }
        return fruitBoxes.stream()
                .filter(fruit -> fruit.getRipeningSeason() == FruitBox.ripeningSeasonEnum.SUMMER)
                .sorted(Comparator.comparing(FruitBox::getPrice))
                .collect(Collectors.toList());

    }

}
package iot.lviv.ua.manager;

import iot.lviv.ua.models.*;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestIfWriteToCSVFileWorksCorrectly {

    @Test
    public void testWriteToCSVFileMethod (){

        FruitShopManager manager = new FruitShopManager();
        List<FruitBox> fruitBoxes = new ArrayList<>(Arrays.asList(
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
                new FruitBox(new Citrus("Lime", "green", RipeningSeason.WINTER, 29)),
                new FruitBox(new Citrus("Grapefruit", "red", RipeningSeason.SPRING, 35)),
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32)),
                new FruitBox(new Berry("Blueberry", "blue", RipeningSeason.AUTUMN, 31)),
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38))
        ));

        try(FileReader expectedFileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\Laboratorna_2_3_Java\\src\\main\\resources\\expectedFruitBoxes.csv");
            BufferedReader expectedBufferedReader = new BufferedReader(expectedFileReader);
            FileReader actualFileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\Laboratorna_2_3_Java\\src\\main\\resources\\fruitBoxes.csv");
            BufferedReader actualBufferedReader = new BufferedReader(actualFileReader)){

            FruitBoxWriter.writeToCSVFile(manager.sortFruitsByPrice(fruitBoxes, RipeningSeason.SUMMER,  true));

            for(int i = 0; i<manager.sortFruitsByPrice(fruitBoxes, RipeningSeason.SUMMER ,  true).size() + 1; i++){
                assertEquals(expectedBufferedReader.readLine(), actualBufferedReader.readLine());
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
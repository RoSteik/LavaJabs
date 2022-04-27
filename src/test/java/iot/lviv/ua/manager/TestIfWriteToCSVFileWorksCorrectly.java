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

        //compare two csv files
        try(FileReader expectedFileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\Laboratorna_2_3_Java\\src\\main\\resources\\expectedFruitBoxes.csv");
            BufferedReader expectedBufferedReader = new BufferedReader(expectedFileReader);
            FileReader actualFileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\Laboratorna_2_3_Java\\src\\main\\resources\\fruitBoxes.csv");
            BufferedReader actualBufferedReader = new BufferedReader(actualFileReader)){

            FruitBoxWriter.writeToCSVFile(manager.sortFruitsByPrice(fruitBoxes, RipeningSeason.SUMMER,  true));

            String line1 = expectedBufferedReader.readLine();
            String line2 = actualBufferedReader.readLine();
            boolean areTwoLinesEqual = true;
            int numberOfLine = 1;

            while (line1 != null || line2 != null) {
                if(line1 == null || line2 == null) {
                    areTwoLinesEqual = false;
                    break;
                }
                else if(!line1.equalsIgnoreCase(line2)) {
                    areTwoLinesEqual = false;
                    break;
                }

                line1 = expectedBufferedReader.readLine();
                line2 = actualBufferedReader.readLine();
                numberOfLine++;
            }

            if(areTwoLinesEqual) {
                assertEquals(expectedBufferedReader.readLine(), actualBufferedReader.readLine());
            } else {
                fail("Two files have different content. They differ at line " + numberOfLine);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
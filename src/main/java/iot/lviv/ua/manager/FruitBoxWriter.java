/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua.manager
 * Class: FruitBoxWriter
 */
package iot.lviv.ua.manager;

import iot.lviv.ua.models.Berry;
import iot.lviv.ua.models.Citrus;
import iot.lviv.ua.models.FruitBox;
import iot.lviv.ua.models.RipeningSeason;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBoxWriter {
    public static void writeToCSVFile(List<FruitBox> fruitBoxes) throws IOException {
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\Laboratorna_2_3_Java\\src\\main\\resources\\fruitBoxes.csv")){

            String previousClassName = "";

            for(var fruitBox: fruitBoxes){
                if(!fruitBox.getClass().getSimpleName().equals(previousClassName)){
                    fileWriter.write(fruitBox.getFruit().getHeaders());
                    fileWriter.write("\r\n");
                    fileWriter.write(fruitBox.getFruit().toCSV());
                    fileWriter.write("\r\n");
                    previousClassName = fruitBox.getClass().getSimpleName();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException{
        List<FruitBox> fruitBoxes = new ArrayList<>(Arrays.asList(
                new FruitBox(new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39)),
                new FruitBox(new Citrus("Lime", "green", RipeningSeason.WINTER, 29)),
                new FruitBox(new Citrus("Grapefruit", "red", RipeningSeason.SPRING, 35)),
                new FruitBox(new Berry("Strawberry", "red", RipeningSeason.SUMMER, 32)),
                new FruitBox(new Berry("Blueberry", "blue", RipeningSeason.AUTUMN, 31)),
                new FruitBox(new Berry("Blackberry", "black", RipeningSeason.SUMMER, 38))
        ));
        FruitShopManager manager = new FruitShopManager();
        writeToCSVFile(manager.sortSummerFruitsByPrice(fruitBoxes,true));
    }

}

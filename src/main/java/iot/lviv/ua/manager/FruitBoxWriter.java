/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua.manager
 * Class: FruitBoxWriter
 */
package iot.lviv.ua.manager;

import iot.lviv.ua.models.FruitBox;


import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class FruitBoxWriter {
    //writes fruitBoxes to csv file
    public static void writeToCSVFile(List<FruitBox> fruitBoxes) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/fruitBoxes.csv")) {
            String previousClassName = "";

            for (var fruitBox: fruitBoxes) {
                if (!fruitBox.getClass().getSimpleName().equals(previousClassName)) {
                    fileWriter.write(fruitBox.getFruit().getHeaders());
                    fileWriter.write("\r\n");
                    previousClassName = fruitBox.getClass().getSimpleName();
                }
                fileWriter.write(fruitBox.getFruit().toCSV());
                fileWriter.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

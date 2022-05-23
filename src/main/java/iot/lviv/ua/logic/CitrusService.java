/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: business.logic
 * Class: CitrusService
 */
package iot.lviv.ua.logic;

import iot.lviv.ua.dataaccess.db.CitrusRepository;
import iot.lviv.ua.models.Citrus;
import iot.lviv.ua.models.RipeningSeason;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CitrusService {

    public Map<Integer, Citrus> findAllCitruses() {
        var result = new HashMap<Integer, Citrus>();

        result.put(1, new Citrus("Orange", "orange", RipeningSeason.SUMMER, 39));
        result.put(2, new Citrus("Lime", "green", RipeningSeason.WINTER, 29));
        result.put(3, new Citrus("Grapefruit", "red", RipeningSeason.SPRING, 35));

        return result;
    }

    public Citrus findCitrusById(Integer id) {
        return findAllCitruses().get(id);
    }

}

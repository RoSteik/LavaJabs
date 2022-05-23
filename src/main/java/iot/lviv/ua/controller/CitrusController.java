/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: controller
 * Class: CitrusController
 */
package iot.lviv.ua.controller;

import iot.lviv.ua.logic.CitrusService;
import iot.lviv.ua.models.Citrus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/citrus")
public class CitrusController {

    @Autowired
    private CitrusService citrusService;

    @GetMapping
    public Map<Integer, Citrus> getAllCitruses() {
        return citrusService.findAllCitruses();
    }

    @GetMapping("/{id}")
    public Citrus getCitrusById(@PathVariable Integer id) {
        return citrusService.findCitrusById(id);
    }
}

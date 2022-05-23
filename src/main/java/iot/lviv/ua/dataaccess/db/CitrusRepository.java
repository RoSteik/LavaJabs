/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua.dataaccess.db
 * Interface: CitrusRepository
 */
package iot.lviv.ua.dataaccess.db;

import iot.lviv.ua.models.Citrus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitrusRepository extends CrudRepository<Citrus, Integer> {
    Citrus findCitrusById(Integer id);
}

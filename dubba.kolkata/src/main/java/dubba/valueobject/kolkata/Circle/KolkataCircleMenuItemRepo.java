package dubba.valueobject.kolkata.Circle;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface KolkataCircleMenuItemRepo extends MongoRepository<MenuItems, String>{
}

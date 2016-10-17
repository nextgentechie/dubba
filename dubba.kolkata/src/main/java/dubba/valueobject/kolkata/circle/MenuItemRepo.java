package dubba.valueobject.kolkata.circle;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface MenuItemRepo extends MongoRepository<MenuItems, String>{
}

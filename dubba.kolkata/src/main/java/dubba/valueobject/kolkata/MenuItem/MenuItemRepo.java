package dubba.valueobject.kolkata.MenuItem;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface MenuItemRepo extends MongoRepository<MenuItems, String>{
}

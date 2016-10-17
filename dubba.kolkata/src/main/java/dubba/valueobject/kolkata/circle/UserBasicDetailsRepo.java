package dubba.valueobject.kolkata.circle;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserBasicDetailsRepo extends MongoRepository<UserBasicDetails, String>{
	List<UserBasicDetails> findByImeino(String imeino);
}


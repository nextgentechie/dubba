package dubba.valueobject.kolkata.circle;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PartnerDetailsRepo extends MongoRepository<PartnerDetails, String>{
	List<PartnerDetails> findByPartnerid(String partnerid);
}


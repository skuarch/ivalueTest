package daos;

import entities.UserPolicyDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author skuarch
 */
@Repository
public interface UserPolicyDetailsDao extends CrudRepository<UserPolicyDetails, Long> {
    
    
    
}

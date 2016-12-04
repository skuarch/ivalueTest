package daos;

import entities.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author skuarch
 */
@Repository
public interface PolicyDao  extends CrudRepository<Policy, Long> {
    
}

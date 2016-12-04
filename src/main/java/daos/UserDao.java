package daos;

import entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author skuarch
 */
@Repository
public interface UserDao extends CrudRepository<Users, Long> {
     
}

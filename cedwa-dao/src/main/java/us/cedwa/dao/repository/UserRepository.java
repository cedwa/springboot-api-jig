package us.cedwa.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import us.cedwa.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by cedwa on 8/18/15.
 */
@Transactional
public interface UserRepository extends PagingAndSortingRepository<User, BigInteger> {

    User findById(BigInteger id);
    List<User> findByName(String name);
}

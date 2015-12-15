package us.cedwa.dao;

import us.cedwa.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cedwa on 8/18/15.
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findById(String id);
    List<User> findByName(String name);
}

package us.cedwa.dao;

import us.cedwa.dao.UserRepository;
import us.cedwa.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by cedwa on 8/30/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = DaoConfiguration.class)
public class UserRepositoryIntegrationTest {

    @Autowired
    UserRepository repository;
    User user;

    @Test
    public void testFindByName() {

        List<User> users = repository.findByName("Chris Edwards");
        for(User user : users){
            System.out.println(String.format("%s", user));
        }
        assertTrue(users.size() > 0);
    }
}

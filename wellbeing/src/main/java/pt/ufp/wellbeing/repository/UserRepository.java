package pt.ufp.wellbeing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pt.ufp.wellbeing.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
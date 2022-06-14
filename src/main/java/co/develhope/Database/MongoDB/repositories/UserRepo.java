package co.develhope.Database.MongoDB.repositories;

import co.develhope.Database.MongoDB.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
}

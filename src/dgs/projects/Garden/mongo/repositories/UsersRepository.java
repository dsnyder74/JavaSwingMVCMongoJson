package dgs.projects.Garden.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dgs.projects.Garden.Models.User;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {
}
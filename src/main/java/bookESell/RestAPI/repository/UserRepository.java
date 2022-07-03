package bookESell.RestAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import bookESell.RestAPI.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

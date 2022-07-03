package bookESell.RestAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import bookESell.RestAPI.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

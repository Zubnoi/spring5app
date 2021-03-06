package ru.tokarev.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tokarev.spring5app.domain.Book;

/**
 * @author tokar on 16.01.2021
 * @project spring5app
 */


public interface BookRepository extends CrudRepository<Book, Long> {
}

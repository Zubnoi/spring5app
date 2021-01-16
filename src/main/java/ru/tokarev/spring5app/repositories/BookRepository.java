package ru.tokarev.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tokarev.spring5app.domain.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
}

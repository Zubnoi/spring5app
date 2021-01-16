package ru.tokarev.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tokarev.spring5app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

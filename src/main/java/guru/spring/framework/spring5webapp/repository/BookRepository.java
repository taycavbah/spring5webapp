package guru.spring.framework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.spring.framework.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

package guru.spring.framework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.spring.framework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

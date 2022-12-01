package guru.spring.framework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.spring.framework.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

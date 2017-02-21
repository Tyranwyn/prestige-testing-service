package be.ordina.testservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by SaFu on 20/02/2017.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface SimpleRepo extends PagingAndSortingRepository<Person, Long>{

    List<Person> findByLastName(@Param("name") String name);

}

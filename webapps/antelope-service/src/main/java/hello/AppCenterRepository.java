package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "app", path = "app")
public interface AppCenterRepository extends PagingAndSortingRepository<Application, Long> {

	List<Application> findByName(@Param("name") String name);

}

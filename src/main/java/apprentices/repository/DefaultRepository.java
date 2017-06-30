package apprentices.repository;

import apprentices.entity.DefaultItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "default", path = "default")
public interface DefaultRepository extends PagingAndSortingRepository<DefaultItem, Long> {

    List<DefaultItem> findByLastName(@Param("name") String name);
}

package moviereservation.infra;

import java.util.List;
import moviereservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "myinfos", path = "myinfos")
public interface MyinfoRepository
    extends PagingAndSortingRepository<Myinfo, Long> {}

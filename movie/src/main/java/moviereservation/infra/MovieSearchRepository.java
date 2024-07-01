package moviereservation.infra;

import java.util.List;
import moviereservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "movieSearches",
    path = "movieSearches"
)
public interface MovieSearchRepository
    extends PagingAndSortingRepository<MovieSearch, Long> {}

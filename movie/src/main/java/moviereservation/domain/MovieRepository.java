package moviereservation.domain;

import java.util.Date;
import java.util.List;
import moviereservation.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MovieRepository
    extends PagingAndSortingRepository<Movie, Long> {}

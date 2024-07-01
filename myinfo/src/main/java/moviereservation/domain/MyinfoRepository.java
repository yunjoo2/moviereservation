package moviereservation.domain;

import java.util.Date;
import java.util.List;
import moviereservation.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "myinfos", path = "myinfos")
public interface MyinfoRepository
    extends PagingAndSortingRepository<Myinfo, Long> {}

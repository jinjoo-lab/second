package second.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import second.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "works", path = "works")
public interface WorkRepository
    extends PagingAndSortingRepository<Work, Long> {}

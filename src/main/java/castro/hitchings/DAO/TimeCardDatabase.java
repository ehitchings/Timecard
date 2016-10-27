package castro.hitchings.DAO;

import castro.hitchings.Entity.TimeCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import java.util.Map;

/**
 * Created by evanhitchings on 10/26/16.
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "TimeCard", path = "hr")
public interface TimeCardDatabase extends CrudRepository {

    public List<TimeCard> getTimeCards(int employeeID);



}

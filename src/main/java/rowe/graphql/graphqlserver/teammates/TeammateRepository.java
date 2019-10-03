package rowe.graphql.graphqlserver.teammates;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeammateRepository extends CrudRepository<Teammate, String> {
}
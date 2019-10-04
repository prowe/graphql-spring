package rowe.graphql.graphqlserver.partners;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, String> {

}
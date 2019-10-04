
package rowe.graphql.graphqlserver.partners;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class GetPartnersResolver implements GraphQLQueryResolver {
    private final PartnerRepository repo;

    public GetPartnersResolver(PartnerRepository repo) {
        this.repo = repo;
    }

    public Iterable<Partner> getPartners() {
        return repo.findAll();
    }
}
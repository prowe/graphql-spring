package rowe.graphql.graphqlserver.partners;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class AddPartnerMutation implements GraphQLMutationResolver {
    private final PartnerRepository repo;

    public AddPartnerMutation(PartnerRepository repo) {
        this.repo = repo;
    }

    public Partner addPartner(String name) {
        Partner partner = new Partner();
        partner.setId(UUID.randomUUID().toString());
        partner.setName(name);
        repo.save(partner);
        return partner;
    }
}
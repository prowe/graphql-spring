package rowe.graphql.graphqlserver.teammates;

import com.coxautodev.graphql.tools.GraphQLResolver;

import org.springframework.stereotype.Component;

import rowe.graphql.graphqlserver.partners.Partner;
import rowe.graphql.graphqlserver.partners.PartnerRepository;

@Component
public class PartnerResolver implements GraphQLResolver<Teammate> {

    private final PartnerRepository partnerRepo;

    public PartnerResolver(PartnerRepository partnerRepo) {
        this.partnerRepo = partnerRepo;
    }

    public Partner partner(Teammate teammate) {
        if (teammate.getPartnerId() == null) {
            return null;
        }
        return partnerRepo.findById(teammate.getPartnerId())
            .orElse(null);
    }
}
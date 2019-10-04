package rowe.graphql.graphqlserver.teammates;

import java.util.Arrays;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class GetTeammatesResolver implements GraphQLQueryResolver {
    private final TeammateRepository repo;

    public GetTeammatesResolver(TeammateRepository repo) {
        this.repo = repo;
    }

    public Iterable<Teammate> getTeammates() {
        return repo.findAll();
    }
}
package rowe.graphql.graphqlserver.teammates;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetchingEnvironment;

@Component
public class GetTeammatesResolver implements GraphQLQueryResolver {
    private static final Logger logger = LoggerFactory.getLogger(GetTeammatesResolver.class);

    private final TeammateRepository repo;

    public GetTeammatesResolver(TeammateRepository repo) {
        this.repo = repo;
    }

    public Iterable<Teammate> getTeammates() {
        return repo.findAll();
    }
}
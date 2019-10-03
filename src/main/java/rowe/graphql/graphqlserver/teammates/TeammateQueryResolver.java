package rowe.graphql.graphqlserver.teammates;

import java.util.Arrays;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class TeammateQueryResolver implements GraphQLQueryResolver {

    public List<Teammate> getTeammates() {
        return Arrays.asList(
            new Teammate("Paul"),
            new Teammate("Ben")
        );
    }
}
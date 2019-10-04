package rowe.graphql.graphqlserver.teammates;

import java.util.Arrays;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class AddTeammateMutation implements GraphQLMutationResolver {
    private final TeammateRepository repo;

    public AddTeammateMutation(TeammateRepository repo) {
        this.repo = repo;
    }

    public Teammate addTeammate(String name) {
        Teammate teammate = new Teammate(name);
        repo.save(teammate);
        return teammate;
    }
}
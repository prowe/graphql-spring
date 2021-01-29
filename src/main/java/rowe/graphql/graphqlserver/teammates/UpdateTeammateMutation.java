package rowe.graphql.graphqlserver.teammates;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetchingEnvironment;

@Component
public class UpdateTeammateMutation implements GraphQLMutationResolver {
    private static final Logger logger = LoggerFactory.getLogger(UpdateTeammateMutation.class);
    private final TeammateRepository repo;

    public UpdateTeammateMutation(TeammateRepository repo) {
        this.repo = repo;
    }

    public Teammate updateTeammate(String id, String name, String partnerId) {
        Teammate teammate = repo.findById(id).orElseThrow();
        teammate.setName(name);
        teammate.setPartnerId(partnerId);
        repo.save(teammate);
        return teammate;
    }
}
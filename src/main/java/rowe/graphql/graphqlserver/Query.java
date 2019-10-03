package rowe.graphql.graphqlserver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String getVersion() {
        return "here is a verison";
    }

}
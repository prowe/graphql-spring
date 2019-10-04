package rowe.graphql.graphqlserver.partners;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partner {
    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
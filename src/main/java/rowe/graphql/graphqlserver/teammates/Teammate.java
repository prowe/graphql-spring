package rowe.graphql.graphqlserver.teammates;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teammate {
    @Id
    private String id;

    private String name;

    public Teammate(){
    }

    public Teammate(String name) {
        setId(UUID.randomUUID().toString());
        setName(name);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
package dgs.projects.Garden.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Session Bean implementation class User
 */
@Document(collection="users")
public class User {

	@Id
    private String id;
    private String username;
    
    public User() { }
    public User(String id, String name) {
    	setID(id);
    	setName(name);
    }
    public String getID() { return id; }
    public void setID(String id) { this.id=id; }
    
    public String getUsername() { return username; }
    public void setName(String name) { username = name; }

}

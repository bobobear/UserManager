package usermanager.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USER_NAME")
    private String name;

    @Column(name = "USER_AGE")
    private int age;

    @Column(name = "USER_IS_ADMIN")
    private boolean isAdmin;

    @Column(name = "USER_CREATED_DATE")
    private Date createdDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

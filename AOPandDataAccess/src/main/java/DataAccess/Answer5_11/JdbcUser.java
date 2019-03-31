package DataAccess.Answer5_11;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class JdbcUser {
    
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SessionFactory sessionFactory;
    
    
    void countUsers() {
        String countQuery = "Select count(*) from user";
        System.out.println(jdbcTemplate.queryForObject(countQuery, Integer.class));
    }
    
    String getUserName() {
        String getName = "Select name from user where username =?";
        return jdbcTemplate.queryForObject(getName, new Object[]{"arpit"}, String.class);
    }
    
    void insertUser() {
        String insert = "Insert into user (username, password, name, age, dob) values(?,?,?,?,?)";
        jdbcTemplate.update(insert, new Object[]{"lohit", "1234", "lohit", 30, new Date()});
    }
    
    void userDetails() {
        String userDetails = "Select * from user where username = ?";
        System.out.println(jdbcTemplate.queryForMap(userDetails, new Object[]{"arpit"}));
    }
    
    void allUsers() {
        String allUsers = "Select * from user";
        System.out.println(jdbcTemplate.queryForList(allUsers));
    }
    
    User getUser() {
        String getUser = "Select * from user where username = ?";
        return jdbcTemplate.queryForObject(getUser,new Object[]{"arpit"},new UserMapper());
    }
    
    void hibernateCountUsers(){
        String count = "Select count(*) from Person";
        Query query = sessionFactory.openSession().createQuery(count);
        System.out.println(query.uniqueResult());
    }
}

package DataAccess.Answer1_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*String driverName="com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        
        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username="arpit";
        String password="Arpit@1234";
        
        Connection connection = DriverManager.getConnection(connectionString,username,password);
        
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }*/
    
        ApplicationContext context = new ClassPathXmlApplicationContext("data-access.xml");
        UserDAO user = context.getBean(UserDAO.class);
        user.printUserNames();
        user.countUsers();
    }
}

package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();    // слой Service отвечает за бизнес-логику
        userService.createUsersTable();                     // здесь используем только методы слоя Service
        
        userService.saveUser("Alex", "Pushkin", (byte) 37);
        userService.saveUser("Anton", "Chekhov", (byte) 35);
        userService.saveUser("Lev", "Tolstoy", (byte) 70);
        userService.saveUser("Vladimir", "Nabokov", (byte) 55);
        
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

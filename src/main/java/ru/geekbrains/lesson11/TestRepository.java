package ru.geekbrains.lesson11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestRepository {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root", "mypass");

        Repository<User> userRepository = new Repository<>(User.class, connection);

        User user = userRepository.findById(1L);
        System.out.println(user);

        user = userRepository.findById(2L);
        System.out.println(user);

        userRepository.insert(new User(null, "Charles", "74585905"));
        userRepository.insert(new User(null, "Samuel", "4757859595tyh"));
        userRepository.insert(new User(null, "Jack", "3748959rd"));
        userRepository.insert(new User(null, "Andrew", "qa098363r5"));
        userRepository.insert(new User(null, "Name", "njhdhddg"));

       //FindAll method
        System.out.println("\n ************************* \n FindAll:");
        userRepository.findAll();

       //Update method
        System.out.println("\n ************************* \n Update:");
        userRepository.update(user);
        userRepository.findAll();

        //Delete method
        System.out.println("\n ************************* \n Delete:");
        userRepository.delete(5L);
        userRepository.findAll();

        //DeleteTable method
        System.out.println("\n ************************* \n DeleteTable:");
        userRepository.deleteAll();
        System.out.println("Table deleted");
        userRepository.findAll();
    }
}
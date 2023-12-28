package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw32", "root", "maiafriend")){
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(name, age, adress, salary) values(?, ?, ?, ?)");
//            preparedStatement.setString(1, "Ion");
//            preparedStatement.setInt(2, 32);
//            preparedStatement.setString(3, "alexandru cel bun");
//            preparedStatement.setInt(4, 70000);
//            preparedStatement.execute();
//        }
//
//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw32", "root", "maiafriend")){
//            PreparedStatement preparedStatement = connection.prepareStatement("update employees set age = 33 where id=1");
//            preparedStatement.execute();
//        }

//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw32", "root", "maiafriend")){
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(name, age, adress, salary) values(?, ?, ?, ?)");
//            preparedStatement.setString(1, "Nicu");
//            preparedStatement.setInt(2, 18);
//            preparedStatement.setString(3, "rascani");
//            preparedStatement.setInt(4, 0);
//            preparedStatement.execute();
//        }

//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw32", "root", "maiafriend")){
//            PreparedStatement preparedStatement = connection.prepareStatement("delete from employees where id = 1");
//            preparedStatement.execute();
//        }

        List<Employees> employeesList = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw32", "root", "maiafriend")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees");
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String adress = resultSet.getString(4);
                int salary = resultSet.getInt(5);
                Employees employees = new Employees(id, name, age, adress, salary);
                employeesList.add(employees);
            }
        }
        System.out.println(employeesList);

    }
}

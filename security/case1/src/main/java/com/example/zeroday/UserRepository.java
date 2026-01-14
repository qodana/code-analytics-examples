package com.example.zeroday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserRepository {
  public String findUserByName(String nameParam) {
    String sql = "SELECT * FROM users WHERE name = '" + nameParam + "'";
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
         Statement statement = connection.createStatement()) {
      statement.execute(sql);
      return sql;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

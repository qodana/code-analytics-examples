package com.example.zeroday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserRepository {
  public String findUserByName(String nameParam) {
    String sql = "SELECT * FROM users WHERE name = ?";
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
         PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, nameParam);
      statement.execute();
      return sql;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

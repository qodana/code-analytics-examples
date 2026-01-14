package com.example.zeroday;

public class UserService {
  private final UserRepository repository = new UserRepository();

  public String searchUser(String nameParam) {
    return repository.findUserByName(nameParam);
  }
}

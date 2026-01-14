package com.example.zeroday;

public class UserController {
  private final UserService service = new UserService();

  public String handleRequest(String nameParam) {
    // nameParam is untrusted input from a request.
    return service.searchUser(nameParam);
  }
}

package com.example.demo.entity;

public class User {
  private Long id;
  private String userName;
  private String passwor;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUser() {
    return userName;
  }

  public void setUser(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return passwor;
  }

  public void setPassword(String passwor) {
    this.passwor = passwor;
  }
}

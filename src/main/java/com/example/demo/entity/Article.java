package com.example.demo.entity;

public class Article {
  private String title;
  private String count;
  private Long tid;
  private Long praisenum;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public Long getTid() {
    return tid;
  }

  public void setTid(Long tid) {
    this.tid = tid;
  }

  public Long getPraisenum() {
    return praisenum;
  }

  public void setPraisenum(Long praisenum) {
    this.praisenum = praisenum;
  }
}

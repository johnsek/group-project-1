package com.github.datenmuehle;

import jakarta.faces.bean.ManagedBean;

//@Name("helloBean")
public class HelloManagedBean {

  public HelloManagedBean() {
    this.greeting = "Hello JSF - Myfaces";
  }

  private String greeting;

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
  
  public static void main(String[] args) {
	  System.out.print("Hello, Maven World");
  }
}

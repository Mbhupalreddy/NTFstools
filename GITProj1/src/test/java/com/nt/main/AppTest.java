package com.nt.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

   @Test
    public void testsumwithPositives() {
       App app=new App();
       int excepted=300;
       int actual=app.sum(100, 200);
       assertEquals(excepted,actual);
    }
   @Test
   public void testsumwithNegitives() {
      App app=new App();
      int excepted=-300;
      int actual=app.sum(-100, -200);
      assertEquals(excepted,actual);
   }
   @Test
   public void testsumwithMixedValues() {
      App app=new App();
      int excepted=100;
      int actual=app.sum(-100, 200);
      assertEquals(excepted,actual);
   }

}
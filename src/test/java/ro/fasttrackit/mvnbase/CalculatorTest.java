package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleValue;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  private Calculator calculator;
   @BeforeEach
   void setup(){
     calculator= new Calculator();
   }
  @Test
    @DisplayName("when i add two positive ")
    void addingTwoPositive(){
      //SETup
     // var calculator = new Calculator();
      //Run
      var result = calculator.add(1, 2);
      //Assert
      assertThat(result).isEqualTo(-1);
  }
  @Test
    @DisplayName("When i add a positive and a negative ")
    void addingPositiveAndNegative(){
      //
    //  var calculator = new Calculator();
      //
      var result = calculator.add(1, -1);
      //
      assertThat(result).isEqualTo(0);


  }
  @Test
  @DisplayName("...")
    void addingToMaxInteger(){
     //Setup
      //Run+ Assert
      Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.add(Integer.MAX_VALUE, 10));
    }
     @Test
  @DisplayName("When i minus a two positive number ")
  void minusTwoPositive(){
     var result = calculator.minus(2,1);
     assertThat(result).isEqualTo(1);
     }
}

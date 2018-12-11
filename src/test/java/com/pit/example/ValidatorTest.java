package com.pit.example;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    Validator validator = new Validator();
    @Test
    public void testNormalPricing2() {
        validator.validate(true, true,true);
        validator.validate(true, true,false);
        validator.validate(true, false,true);
//        validator.validate(false, true,true);


    }

    @Test
    public void testNormalPricing22() {
        validator.validate(false, true,true);
    }
  //  A  B  C
  //  F  F  F
  //  F  F  T   X
  //  F  T  F
  //  F  T  T   X
  //  T  F  F   X
  //  T  F  T   X
  //  T  T  F   X
  //  T  T  T   X

    //1 a == 1 && b == 2 && c ==3   A      B      C
    //   true     true      true    T      T      T

    //2 a == 1 && b == 2 && c ==4
    //   true     true      false

    //3 a == 1 && b == 4 && c ==4
    //   true     false     false

    //4 a == 5 && b == 4 && c ==3
    //   false     false    true

    //5 a == 5 && b == 2 && c ==3
    //   false     true     true

    //6 a == 1 && b == 6 && c ==3
    //   true     false     true
    //6 a == 3 && b == 2 && c ==5
    //   false     true     false




}
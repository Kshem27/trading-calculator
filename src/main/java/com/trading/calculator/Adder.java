package com.trading.calculator;

/**
 * Hello world!
 *
 */
public class Adder 
{
   private AddingValidator validator;
   public Adder(AddingValidator validator) {
      this.validator = validator;
   }
   public int add(int input1, int input2){
      if(!validator.validate())return 0;
        return input1+input2;
   }
}

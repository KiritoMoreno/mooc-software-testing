package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

public class LeapYearTestWithBeforeEach {

    // Two ways to do the Test
    private LeapYear ly;

    @BeforeEach
    public void initialize(){ this.ly = new LeapYear();}
    //->
    @Test
    public void divisibleBy4NotDivisibleBy100(){
        Boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
    @Test
    public void leapYearsThatAreNonCenturialYears(){
        Assertions.assertTrue(ly.isLeapYear(2020));
    }
    //<-

    // ->
    @Test
    public void divisibleBy4By6By100Centurial(){
        Assertions.assertTrue(ly.isLeapYear(2000));
    }
    @Test
    public void leapCenturialYears(){
        Boolean result = ly.isLeapYear(4000);
        Assertions.assertTrue(result);
    }
    //<-

    //->
    @Test
    public void notDivisibleBy4(){
        Assertions.assertFalse(ly.isLeapYear(2015));
    }
    @Test
    public void nonLeapYears(){
        Boolean result = ly.isLeapYear(2017);
        Assertions.assertFalse(result);
    }

    //<-

    //->
    @Test
    public void DivisibleBy4By100NotBy400(){
        Assertions.assertFalse(ly.isLeapYear(1500));
    }
    @Test
    public void nonLeapCenturialYears(){
        Boolean result = ly.isLeapYear(1900);
        Assertions.assertFalse(result);
    }
    //<-
}

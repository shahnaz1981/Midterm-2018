package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

       Factorial fa= new Factorial();
       Fibonacci fa1=new Fibonacci();
       FindLowestDifference fa2=new FindLowestDifference();
       FindMissingNumber fa3=new FindMissingNumber();

       boolean result= fa.equals(true);

       Assert.assertEquals(false,result);

    }
}

package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student( "Mohibur","Rahman","75","44NY");



        //Unit test for first name

        try{
            Assert.assertEquals(student.getFirstName(),"Mohibur");
            System.out.println("Test Passed");
        }catch ( AssertionError as){
            System.out.println(" Test Failed ");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for Last name
        try{
            Assert.assertEquals(student.getLastName(),"Rahman");
            System.out.println(" Test passed lastName");
        }catch (AssertionError as){
            System.out.println(" Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getScore name
        try{
            Assert.assertEquals(student.getScore(),"7500");
            System.out.println("Test passed for Score");
        }catch (AssertionError as){
            System.out.println("Test Failed for Score");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getID name
        try{
            Assert.assertEquals(student.getId(),"44NY");
            System.out.println("Test passed for Id");
        }catch (AssertionError as){
            System.out.println(" Test Failed for Id");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}





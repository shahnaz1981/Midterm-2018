package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args)throws java.lang.AssertionError {
        //Apply Unit Test into all the methods in this package.



        //Unit test for the Longest word
        try {
            String str1 = "LIFE so interesting";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str1), "so");
            System.out.println(" largest value unit test Passed.");
        } catch (AssertionError as) {
            System.out.println(" largest value unit test Failed");
        }

        //Unit test for Anangram Problem
        try {
            Assert.assertEquals(Anagram.isAnagram1("ARMY", "MARY"), true);
            System.out.println("Anagram unit test Passed.");
        } catch (AssertionError as) {
            System.out.println("Anagram unit test  failed");
        }

        //unit testing for palindrome
       try {//Unit test for palindrome
        String str1 = "CACA";
            boolean expected = true;
           Assert.assertEquals(Palindrome.palindromeChecking(str1),expected);
            System.out.println("Palindrome unit test passed.");
        } catch (AssertionError as){
            System.out.println("Palindrome unit test failed.");



    }

    }
}
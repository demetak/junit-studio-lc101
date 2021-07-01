package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(BalancedBrackets.hasBalancedBrackets(""), true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    @Test
    public void multipleBracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch][Code][Rocks!]]"));
    }

    @Test
    public void multipleBracketsWithExtraClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch][Code][Rocks!]]]"));
    }

    @Test
    public void multipleBracketsWithIncorrectOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]][[[]"));
    }

    @Test
    public void multipleBracketsWithIncorrectOrderReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]][Code[]"));
    }
    @Test
    public void bracketsWithIncorrectOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsWithIncorrectOrderReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void missingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void missingBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }



}

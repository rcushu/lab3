import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test 
	public void test2ReverseInPlace() {
    int[] input1 = {4, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 4}, input1);
	}

  @Test 
	public void test3ReverseInPlace() {
    int[] input1 = {4, 2, 3, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 3, 2, 4}, input1);
	}

  @Test
  public void test2Reversed() {
    int[] input1 = {4, 2, 3};
    assertArrayEquals(new int[]{3, 2, 4}, ArrayExamples.reversed(input1));
  }
}

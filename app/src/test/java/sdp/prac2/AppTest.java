/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {
    @Test // Task 1 tests
    public void testTask1() {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(0, 1, -1, 3);
        int expectedSum = 3;
        int actualSum = new SimpleFunctions().task1(a, b);
        assertEquals(expectedSum, actualSum);

        b = Arrays.asList(-1);
        expectedSum = 0;
        actualSum = new SimpleFunctions().task1(a, b);
        assertEquals(expectedSum, actualSum);

        b = Arrays.asList(3);
        expectedSum = 0;
        actualSum = new SimpleFunctions().task1(a, b);
        assertEquals(expectedSum, actualSum);

        b = Arrays.asList();
        expectedSum = 0;
        actualSum = new SimpleFunctions().task1(a, b);
        assertEquals(expectedSum, actualSum);

        a = Arrays.asList();
        b = Arrays.asList(0);
        expectedSum = 0;
        actualSum = new SimpleFunctions().task1(a, b);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void task2Test1() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("");
        list.add("me");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("ello");
        expected.add("e");

        // act
        ArrayList<String> result = classBeingTested.task2(list);
        // assert
        assertIterableEquals(expected, result);
    }

    @Test
    void task2Test2() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("m");
        list.add("");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("ello");
        // act
        ArrayList<String> result = classBeingTested.task2(list);
        // assert
        assertIterableEquals(expected, result);
    }

    @Test
    public void task4Test1() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(4, 5, 6);
        List<Integer> expectedResult = List.of(6, 10, 12);  // Assuming the task4 logic

        // Act
        List<Integer> actualResult = classBeingTested.task4(a, b);

        // Assert
        assertIterableEquals(expectedResult, actualResult); // Comparing lists
    }

    // test for empy lists
    @Test
    public void task4Test2() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> a = new ArrayList<>(); // Empty list
        List<Integer> b = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();

        // Act
        List<Integer> actualResult = classBeingTested.task4(a, b);

        // Assert
        assertIterableEquals(expectedResult, actualResult); 
    }
    //test diff sizes
    @Test
    public void task4Test3() {
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> a = List.of(1, 2);
        List<Integer> b = List.of(3, 4, 5); // Different sizes
        List<Integer> expectedResult = null; // Or your desired handling

        // Act
        List<Integer> actualResult = classBeingTested.task4(a, b);

        // Assert
        assertNull(actualResult);  // Checking for null return on different sizes
    }

    @Test
    public void testTask6_NeedRounding() {
        List<Integer> numbers = Arrays.asList(101, 250, 999);
        List<Integer> expected = Arrays.asList(200, 300, 1000);
        assertEquals(expected, SimpleFunctions.task6(numbers));
    }

    @Test
    public void testTask6_Mixed() {
        List<Integer> numbers = Arrays.asList(50, 150, 200, 345);
        List<Integer> expected = Arrays.asList(100, 200, 200, 400);
        assertEquals(expected, SimpleFunctions.task6(numbers));
    }

    @Test
    public void testTask5WithSortedIntegers() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(SimpleFunctions.task5(sortedList));
    }

    @Test
    public void testTask5WithEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        assertTrue(SimpleFunctions.task5(emptyList));
    }


}

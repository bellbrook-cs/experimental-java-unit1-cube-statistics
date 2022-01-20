/*
 * Program Title: Java Test Runner
 * Author: Hayden Mankin
 * Date: 1/19/2021
 * Purpose: Run tests on Java programming assignments.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import java.util.Date;
import org.junit.Ignore;
import org.junit.runner.Description;
import static org.junit.Assert.assertEquals;

public class TestRunner {
  @Test
  public void testSurfaceArea_1x1x1() {
    assertEquals(6, Main.getSurfaceArea(1));
  }
  
  @Test
  public void testSurfaceArea_2x2x2() {
    assertEquals(24, Main.getSurfaceArea(2));
  }
  
  @Test
  public void testSurfaceArea_4x4x4() {
    assertEquals(96, Main.getSurfaceArea(4));
  }

  @Test
  public void testVolume_1x1x1() {
    assertEquals(1, Main.getVolume(1));
  }

  @Test
  public void testVolume_2x2x2() {
    assertEquals(1, Main.getVolume(1));
  }
  
  @Test
  public void testVolume_4x4x4() {
    assertEquals(64, Main.getVolume(4));
  }
  
  public static void main(String[] args) {
    JUnitCore runner = new JUnitCore();
    runner.addListener(new TestListener());
    Result result = runner.run(TestRunner.class);
  }
}

class TestListener extends RunListener {
  long startTime;
  long endTime;

  @Override
  public void testRunStarted(Description description) {
      startTime = new Date().getTime();
      System.out.println("Starting Tests...\n");
  }
  @Override
  public void testRunFinished(Result result) throws Exception {
      endTime = new Date().getTime();
      System.out.println("Tests Completed!");
      System.out.printf("Number of test cases: %d%n", result.getRunCount());
      if (result.wasSuccessful()) {
        System.out.println("All tests passed! Congrats!");
      } else {
        System.out.printf("Failed %d/%d tests, see above for more information%n", result.getFailureCount(), result.getRunCount());
      }
      long elapsedSeconds = (endTime - startTime) / 1000;
      System.out.printf("Elapsed time of tests execution: %s seconds%n", elapsedSeconds);
    
      System.out.println("\nRunning main method...\n");
      Main.main(new String[0]);
  }
  @Override
  public void testStarted(Description description) {
      System.out.printf("%s test is starting...%n", description.getMethodName());
  }
  @Override
  public void testFinished(Description description) {
      System.out.printf("%s test is finished...%n%n", description.getMethodName());
  }
  @Override
  public void testFailure(Failure failure) {
      System.out.printf("%s test FAILED!%n", failure.getDescription().getMethodName());
      System.out.println(failure.getMessage());
  }
  @Override
  public void testIgnored(Description description) throws Exception {
      super.testIgnored(description);
      Ignore ignore = description.getAnnotation(Ignore.class);
      System.out.printf("@Ignore test method '%s()': '%s'%n", description.getMethodName(), ignore.value());
  }
}

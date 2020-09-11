package java8.easy.voterEnrolment;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.easy.voterEnrolment.TestUtils.*
;public class MainTest {

	@Test
	public void testCalculateAge() throws Exception{
	  yakshaAssert(currentTest(),Main.calculateAge("15-08-2002")?"true":"false",businessTestFile);
	  yakshaAssert(currentTest(),Main.calculateAge("15-08-2010")?"true":"false",businessTestFile);
	
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}

package com.samples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * When using Parameters all the tests in the class will be executed as many times as set of parameters we have defined.
 * For example, in this class we have 3 sets of parameters defined,
 * so, "isValidLogFileVariousExtensionsEvaluateThem" and "anotherTest" will be execute 3 times each one.
 * @author jcalderon
 *
 */

@RunWith(Parameterized.class)
public class LogAnalyzerTest {
	
	@Parameters(name = "{index}: logFileName={0} expected result: {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"mylog.slf", true}, {"mylog.SLF", true}, {"mylog.log", false}
		});
	};
	
	private String fileName;
	private Boolean expectedValue;
	
	public LogAnalyzerTest(String name, Boolean value) {
		this.fileName = name;
		this.expectedValue = value;
	}
	
	@Test
	public void isValidLogFileVariousExtensionsEvaluateThem() {
		LogAnalyzer analyzer = new LogAnalyzer();
		assertEquals(expectedValue,  analyzer.isValidLogFileName(fileName));
	}	
	
	@Test
	public void anotherTest() {
		LogAnalyzer analyzer = new LogAnalyzer();
		Boolean result = analyzer.isValidLogFileName("mylog.slf");
		assertTrue(result);
	}
}

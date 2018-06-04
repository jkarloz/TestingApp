package com.samples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
	
}

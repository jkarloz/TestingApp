package com.samples;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import com.samples.categories.FastTests;
import com.samples.categories.SlowTests;

public class LogAnalyzerTest2 {

	@Rule public ExpectedException exception = ExpectedException.none();
	
	@Category(SlowTests.class)
	@Test
	public void isValidLogFileEmptyNameThrowsException() throws NullPointerException {
		LogAnalyzer analyzer = new LogAnalyzer();
		exception.expect(NullPointerException.class);
		analyzer.isValidLogFileName(null);		
	}
	
	@Category(FastTests.class)
	@Test
	public void isValidLogFileValidNameReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();
		Boolean result = analyzer.isValidLogFileName("myLogfile.slf");
		assertTrue(result);
	}

}

package com.samples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LogAnalyzerTest2 {

	@Rule public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void isValidLogFileEmptyNameThrowsException() throws NullPointerException{
		LogAnalyzer analyzer = new LogAnalyzer();
		exception.expect(NullPointerException.class);
		analyzer.isValidLogFileName(null);		
	}

}

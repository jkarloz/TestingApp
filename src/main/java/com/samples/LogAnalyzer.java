package com.samples;

public class LogAnalyzer {
	public Boolean isValidLogFileName(String filename) {
		String fileExtension = ".SLF";
		if(!filename.toUpperCase().endsWith(fileExtension)) {
			return false;
		}
		return true;
	}
}

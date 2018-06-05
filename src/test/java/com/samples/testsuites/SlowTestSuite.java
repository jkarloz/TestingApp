package com.samples.testsuites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.samples.LogAnalyzerTest2;
import com.samples.categories.SlowTests;

/**
 * Running this TestSuite all the tests configured will be executed
 * in this case the tests with category = "SlowTests" included in "LogAnalizerTest2" class
 * @author jcalderon
 *
 */

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@SuiteClasses({LogAnalyzerTest2.class})
public class SlowTestSuite {
	
}

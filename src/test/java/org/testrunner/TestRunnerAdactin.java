package org.testrunner;

import org.MavenBase.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue ="org.stepdefinition",dryRun=false,
monochrome =true,tags= {"@Login"},
plugin = {"pretty","html:target\\Reports","json:target\\Report\\adac.json","junit:target\\Reports\\adactin1.xml"
		,"rerun:src\\test\\resources\\Rerun\\failed.txt",})


public class TestRunnerAdactin {
	
@AfterClass
public static void jvmReportGeneration() {
	JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\adac.json");
	
}
}

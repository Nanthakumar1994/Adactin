package org.stepdefinition;

import java.io.IOException;

import org.MavenBase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksAdactin extends BaseClass  {
@Before
public void beforeScenario() {
	System.out.println("Scenario starts");

}
@After
public void afterScenario(Scenario s) throws IOException {
	System.out.println("Scenario ends");
//String name = s.getName();
//String filename = name.replace(" ", "_");
//takeSnap(filename);
if (s.isFailed()) {
	TakesScreenshot ts = (TakesScreenshot)driver;
	byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	s.embed(screenshot, "image/png");
}

}
}

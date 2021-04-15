package org.MavenBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonpath) {
	
File fs = new File("D:\\Cucumbersample01\\target\\Report\\JVM Report");
Configuration con = new Configuration(fs, "AdactinApplication");
con.addClassifications("platformname", "Windows10");
con.addClassifications("Browser name", "Chrome");
con.addClassifications("Browser version", "89.0");
con.addClassifications("Sprint number", "23");
List<String> li = new ArrayList<String>();
li.add(jsonpath);
ReportBuilder r = new ReportBuilder(li, con);
r.generateReports();

}
}

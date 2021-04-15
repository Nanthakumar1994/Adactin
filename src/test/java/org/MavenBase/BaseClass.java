package org.MavenBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver cofigBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		return driver;
	}
	public static void urlLaunch(String s) {
		driver.get(s);

	}
	public static void title() {
		driver.getTitle();

	}
	public static void curturl() {
		driver.getCurrentUrl();

	}
	public static void send(WebElement e, String a) {
		e.sendKeys(a);

	}
	public static void clk(WebElement d) {
		d.click();

	}
	public static void getattribute(WebElement ref) {
		String s = ref.getAttribute("value");
		System.out.println(s);

	}
	public static void gettextsys(WebElement ref) {
	String t = ref.getText();
	System.out.println(t);

	}
	public static void xpath(String s , String k ) {
		driver.findElement(By.xpath(s)).sendKeys(k);
		

	}
	public static void id(String s, String k) {
		driver.findElement(By.id(s)).sendKeys(k);

	}
	public static void name(String s, String k) {
		driver.findElement(By.id(s)).sendKeys(k);

	}
	public static void xpathclk(String s) {
		driver.findElement(By.xpath(s)).click();

	}
	public static void idclk(String s) {
		driver.findElement(By.xpath(s)).click();

	}

	public static void mousemove(Actions a, WebElement b) {
		a.moveToElement(b).perform();

	}
	public static void contextclick(Actions a) {
		a.contextClick().perform();
	}
	public static void Actions() {
		Actions a = new Actions(driver);

	}
	public static void doubleclick(Actions a) {
		a.doubleClick().perform();
	}
	public static void gettext(WebElement e ) {
	 String f =  e.getText();
	}

	public static void Rob() throws AWTException {
		Robot r = new Robot();
	}
	public static void Pdown(Robot r) {
		r.keyPress(KeyEvent.VK_DOWN);

	} 

	public static void Rdown(Robot r) {
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void Penter(Robot r) {
		r.keyPress(KeyEvent.VK_ENTER);

	}
	public static void Renter(Robot r) {
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void ptab(Robot r) {
		r.keyPress(KeyEvent.VK_TAB);

	}
	public static void rtab(Robot r) {
		r.keyRelease(KeyEvent.VK_TAB);

	}
	public static void takeSnap(String filename) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\Cucumbersample01\\Screenshot1\\"+ filename + ".png");
    FileUtils.copyFile(src, dest);
	}

	public static void alert() {
		Alert a =driver.switchTo().alert();
	}
	public static void script() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	}
	public static void max() {
		driver.manage().window().maximize();

	}
	public static void thread(int s) throws InterruptedException {
		Thread.sleep(s);

	}
	public static void screenshoot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
	   
	}
	public static void selectByIndex(WebElement ref , int index) {
	Select s = new Select(ref);
	s.selectByIndex(index);
	}
	public static void selectByValue(WebElement ref , String value) {
		Select s = new Select(ref);
		s.selectByValue(value);

	}
	public static void selectByText(WebElement ref , String text) {
		Select s = new Select(ref);
		s.selectByVisibleText(text);

	}
	public static String excellRead(int rowNo, int cellNo ) throws IOException {
		File fin = new File("D:\\SampleMaven\\Exelworksheet\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream f =new FileInputStream(fin);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		
			Row r = s.getRow(rowNo);
			
				Cell c = r.getCell(cellNo);
				int cellType = c.getCellType();
				String value ;
				if (cellType==1) {
				 value = c.getStringCellValue();
			
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					 value = sim.format(d);
				}
				else {
					double da = c.getNumericCellValue();
					long l = (long)da;
					 value = String.valueOf(l);
					
				}
				return value;
			}
		
	public static Map<String,String> readExcel(String testcaseId) throws IOException {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
	File f = new File("D:\\\\SampleMaven\\\\Exelworksheet\\\\New Microsoft Excel Worksheet.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet sheet = w.getSheet("Sheet1");
	
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String testcaseno = cell.getStringCellValue();
		
		
		if (testcaseno.equals(testcaseId)) 
		{
		Row headerrow = sheet.getRow(0);
		Row requiredrow = sheet.getRow(i);
		for (int j = 0; j < headerrow.getPhysicalNumberOfCells(); j++) 
		{
			
		Cell heading = headerrow.getCell(j);	
		Cell data = requiredrow.getCell(j);
		
		String txtheading = heading.getStringCellValue();
		String txtdata = data.getStringCellValue();
		
		
		map.put(txtheading, txtdata);
		}
			
		}
		
	}
return map;
	}	
		

	}



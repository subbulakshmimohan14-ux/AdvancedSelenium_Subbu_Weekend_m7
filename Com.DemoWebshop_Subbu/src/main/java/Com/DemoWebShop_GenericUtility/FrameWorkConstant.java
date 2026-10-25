package Com.DemoWebShop_GenericUtility;

public interface FrameWorkConstant
{
javaUtility javautility = new javaUtility();
static String propertyFilePath ="./src/test/resources/TestData/commondata.properties";
static String excelFilePath ="./src/test/resources/TestData/testScriptdata.xlsx";
static String screenshotPath ="./screenshots/"+javautility.localDateAndTime()+".png";
static String reportPath ="./reports/"+javautility.localDateAndTime()+".html";

}

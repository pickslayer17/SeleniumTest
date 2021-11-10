import lib.ReadExcelLib;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider
    public Object[][] dataProvider1(){
        ReadExcelLib readExcelLib = new ReadExcelLib();
        String fileName = ReadExcelLib.class.getClassLoader().getResource("ExcelExample.xlsx").getFile();
        String sheetName = "Sheet1";
        int numberOfColumns = 3;
        return readExcelLib.GetExcelData(fileName, sheetName, numberOfColumns);
    }

    @DataProvider
    public Object[][] dataProvider2(){
        Object[][] arr = new Object[1][3];
        arr[0][0] = "First";
        arr[0][1] = "Second";
        arr[0][2] = "Third and the last.";
        return arr;

    }
}

package excels;

import com.excel.lib.util.Xls_Reader;

public class utilread {

	public static void main(String[] args) {
		readerwriter();
	}
	
	public static void readerwriter()
	{
		Xls_Reader wr=new Xls_Reader("./src/excels/reader.xlsx");
        String sheetname="Sheet1";
        
        int count=wr.getRowCount(sheetname);
        System.out.println(count);
        for(int rownum=2;rownum<=count;rownum++)
        {
        	String username=wr.getCellData(sheetname, "username", rownum);
        	System.out.println(username);
        	String pass=wr.getCellData(sheetname, 1, rownum);
        	System.out.println(pass);
        	wr.setCellData(sheetname, "Status", rownum,"dataprinted");
        }
	}
}

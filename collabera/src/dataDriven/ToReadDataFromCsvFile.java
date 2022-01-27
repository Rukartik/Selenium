package dataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;

public class ToReadDataFromCsvFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("./testResources/cvsFile/testData.csv");

		CSVReader csvReader = new CSVReader(fr);

		List<String[]> allData = csvReader.readAll();

		for (String[] sar : allData) {
			for (String d : sar) {
				System.out.println(d);
			}
		}

	}

}
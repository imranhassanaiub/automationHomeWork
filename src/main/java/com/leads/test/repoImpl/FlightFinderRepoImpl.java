package com.leads.test.repoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.leads.test.model.FlightFinder;
import com.leads.test.repoInterface.FlightFinderRepo;
import com.leads.test.utils.Utils;

public class FlightFinderRepoImpl implements FlightFinderRepo<FlightFinder> {

	public FlightFinder get() throws IOException {

		FileInputStream inputStream = new FileInputStream(new File(Utils.excelFilePath2));
		Workbook workbook = new XSSFWorkbook(inputStream);

		System.out.println("WorkBook Found!!" + inputStream);

		Sheet secondSheet = workbook.getSheetAt(0);
		Row row = secondSheet.getRow(1);
		System.out.println("Row Found for file2" + row);

		Cell cellone = row.getCell(0);
		Cell celltwo = row.getCell(1);
		FlightFinder flightfinder = new FlightFinder();

		flightfinder.setPassengerdropdown(cellone.getStringCellValue());
		System.out.println(cellone.getStringCellValue());

		flightfinder.setDepartingfromdropdown(celltwo.getStringCellValue());
		System.out.println(celltwo.getStringCellValue());

		workbook.close();
		inputStream.close();

		return flightfinder;
	}

}

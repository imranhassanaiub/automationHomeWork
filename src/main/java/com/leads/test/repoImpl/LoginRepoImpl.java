package com.leads.test.repoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.leads.test.model.Login;
import com.leads.test.repoInterface.LoginRepo;
import com.leads.test.utils.Utils;

public class LoginRepoImpl implements LoginRepo<Login> {

	public Login get() throws IOException {

		FileInputStream inputStream = new FileInputStream(new File(Utils.excelFilePath));
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);

		Row row = firstSheet.getRow(1);

		Cell cellone = row.getCell(0);
		Cell celltwo = row.getCell(1);
		Login login = new Login();

		login.setUsername(cellone.getStringCellValue());
		System.out.println(cellone.getStringCellValue());
		login.setPassword(celltwo.getStringCellValue());

		System.out.println(celltwo.getStringCellValue());
		workbook.close();
		inputStream.close();

		return login;

	}

}

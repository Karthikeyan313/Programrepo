package com.tutorial.SeleniumTutorial;

import java.sql.Connection;

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Day4Fillo {
	Fillo fillo = new Fillo();
	Connection connection = (Connection) fillo.getConnection("E:\\Maveric Sessioc\\Selenium\\Fillo.xlsx");
	String strSelectQuerry = "Select * from  sheetl where Emp id =10";
	Recordset recordset = connection.executeQuery(strSelectQuerry);
	}

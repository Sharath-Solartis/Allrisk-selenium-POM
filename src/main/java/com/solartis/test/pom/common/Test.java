package com.solartis.test.pom.common;

import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.operations.DatabaseOperation;

public class Test {

	public static void main(String[] args) throws DatabaseException {
		DatabaseOperation DB = new DatabaseOperation();
		
		DB.ConnectionSetup("com.mysql.jdbc.Driver", "jdbc:mysql://192.168.84.225:3700/TestDB_Allrisk", "root", "redhat");
		DB.InserValueWithRowNumber("Vicky", "PolicyFee", "100", 1);
		
		DB.InserValueWithRowNumber("Vicky", "TbasePremium", "1001", 1);
		
		DB.CloseConn();
	}

}

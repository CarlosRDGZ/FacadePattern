package facade;

import java.sql.Connection;

public class OracleHelper
{
    public static Connection getOracleDBConnection()
    {
		System.out.println("Begins session with a specific Oracle database.");
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con)
    {
		System.out.println("Oracle. Get data from table and generate a PDF report.");
	}

	public void generateOracleHTMLReport(String tableName, Connection con)
    {
		System.out.println("Oracle. Get data from table and generate a HTML report.");
	}
}

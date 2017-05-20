package facade;

import java.sql.Connection;

public class MySQLHelper
{
    public static Connection getMySQLDBConnection()
    {
        System.out.println("Begins session with a specific MySQL database.");
		return null;
	}

	public void generateMySQLPDFReport(String tableName, Connection con)
    {
        System.out.println("MySQL. Get data from table and generate a PDF report.");
	}

	public void generateMySQLHTMLReport(String tableName, Connection con)
    {
        System.out.println("MySQL. Get data from table and generate a HTML report.");
	}
}

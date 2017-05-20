package facade;

import java.sql.Connection;

public class HelperFacade
{
    public static void generateReport(DBTypes dbType,
        ReportTypes reportType, String tableName)
    {
		Connection con = null;
		switch (dbType)
        {
    		case MYSQL:
            {
    			con = MySQLHelper.getMySQLDBConnection();
    			MySQLHelper mySQLHelper = new MySQLHelper();
    			switch(reportType)
                {
    			case HTML:
    				mySQLHelper.generateMySQLHTMLReport(tableName, con);
    				break;
    			case PDF:
    				mySQLHelper.generateMySQLPDFReport(tableName, con);
    				break;
    			}
            }
            break;
    		case ORACLE:
            {
    			con = OracleHelper.getOracleDBConnection();
    			OracleHelper oracleHelper = new OracleHelper();
    			switch(reportType){
    			case HTML:
    				oracleHelper.generateOracleHTMLReport(tableName, con);
    				break;
    			case PDF:
    				oracleHelper.generateOraclePDFReport(tableName, con);
    				break;
    			}
    		}
            break;
		}
	}

	public static enum DBTypes{
		MYSQL,ORACLE;
	}

	public static enum ReportTypes{
		HTML,PDF;
	}
}

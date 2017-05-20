package facade;

import java.sql.Connection;

public class FacadePatternDemo
{
    public static void main(String[] args)
    {
        String tableName = "Employee";

		//generating MySql HTML report and Oracle PDF report without using Facade
        System.out.println("- Generating reports without using Facade");
		Connection con = MySQLHelper.getMySQLDBConnection();
		MySQLHelper mySQLHelper = new MySQLHelper();
		mySQLHelper.generateMySQLHTMLReport(tableName, con);
        System.out.println();
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

        System.out.println();

        //generating MySql HTML report and Oracle PDF report using Facade
        System.out.println("- Generating reports using Facade");
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        System.out.println();
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }

}

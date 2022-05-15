package bridgelabz.Census_Analyzer;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerStateCodeTest {

	  private static final String INDIA_STATE_CSV_PATH = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.csv";

	    
	    @Test
	    public void givenIndianStateCSVFileReturnsCorrectRecords() {
	        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
	        try {
	            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
	            Assert.assertEquals(37, numOfRecord);
	        } catch (CensusAnalyzerException e) {
	            e.printStackTrace();
	        }
	    }

	
	    @Test
	    public void givenIndianStateCSVFileReturnsInCorrectRecords() {
	        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
	        try {
	            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_STATE_CSV_PATH);
	
	            Assert.assertNotEquals(40, numOfRecord);
	
	            Assert.assertEquals(40, numOfRecord);
	
	        } catch (CensusAnalyzerException e) {
	            e.printStackTrace();
	        }
	    }
}

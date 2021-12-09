package sample;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
    //STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
    private double[][] dataSet1 = {{-1.0, -97.0, -2.5}, {98.3}, {68.4, 17.1, 20.0}, {-0.9, 12.2}};
    private double[][] dataSet2 = {{-10.0, 78.2}, {37.5, -21.4, 45.6}, {-12.0, -89.7}, {78.9, 6.3, 45.0}};
    private double[][] dataSet3 = {{69.4}, {93.3, -22.2}, {-99.1, -28.7, 2.5}, {48.2}, {17.1, 13.3}, {-3.6}};

    private File inputFile,outputFile;

    @Before
    public void setUp() throws Exception {
        outputFile = new File("TestOut.txt");
    }

    @After
    public void tearDown() throws Exception {
        dataSet1 = dataSet2 = dataSet3 = null;
    }

    /**
     * Student Test getTotal method
     * Return the total of all the elements in the two dimensional array
     */
    @Test
    public void testGetTotal() {
        assertEquals(114.6,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
        assertEquals(158.4,TwoDimRaggedArrayUtility.getTotal(dataSet2),.001);
        assertEquals(90.2,TwoDimRaggedArrayUtility.getTotal(dataSet3),.001);
    }

    /**
     * Student Test getAverage method
     * Return the average of all the elements in the two dimensional array
     */
    @Test
    public void testGetAverage() {
        assertEquals(12.733,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
        assertEquals(15.84,TwoDimRaggedArrayUtility.getAverage(dataSet2),.001);
        assertEquals(9.02,TwoDimRaggedArrayUtility.getAverage(dataSet3),.001);
    }

    /**
     * Student Test getRowTotal method
     * Return the total of all the elements of the row.
     * Row 0 refers to the first row in the two dimensional array
     */
    @Test
    public void testGetRowTotal() {
        assertEquals(98.3,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
        assertEquals(-100.5,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,0),.001);
        assertEquals(61.7,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,1),.001);
        assertEquals(68.2,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,0),.001);
        assertEquals(-125.3,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,3),.001);
        assertEquals(71.1,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,1),.001);
    }


    /**
     * Student Test getColumnTotal method
     * Return the total of all the elements in the column. If a row in the two dimensional array
     * doesn't have this column index, it is not an error, it doesn't participate in this method.
     * Column 0 refers to the first column in the two dimensional array
     */
    @Test
    public void testGetColumnTotal() {
        assertEquals(164.8,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
        assertEquals(-67.7,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
        assertEquals(90.6,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2,2),.001);
        assertEquals(-35.6,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2,1),.001);
        assertEquals(125.3,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3,0),.001);
        assertEquals(-37.6,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3,1),.001);
    }


    /**
     * Student Test getHighestInArray method
     * Return the largest of all the elements in the two dimensional array.
     */
    @Test
    public void testGetHighestInArray() {
        assertEquals(98.3,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
        assertEquals(78.9,TwoDimRaggedArrayUtility.getHighestInArray(dataSet2),.001);
        assertEquals(93.3,TwoDimRaggedArrayUtility.getHighestInArray(dataSet3),.001);
    }


    /**
     * Test the writeToFile method
     * write the array to the outputFile File
     * then read it back to make sure formatted correctly to read
     *
     */
    @Test
    public void testWriteToFile() {
        double[][] array=null;
        try {
            TwoDimRaggedArrayUtility.writeToFile(dataSet3, outputFile);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }

        assertEquals(69.4, array[0][0],.001);
        assertEquals(93.3, array[1][0],.001);
        assertEquals(-22.2, array[1][1],.001);
        assertEquals(-99.1, array[2][0],.001);
        assertEquals(-28.7, array[2][1],.001);
        assertEquals(48.2, array[3][0],.001);


    }

}
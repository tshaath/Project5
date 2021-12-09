package sample;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusSTUDENTTest {
    //create several (more than 2) data sets for testing. These data sets must be different
    //then the data sets in HolidayBonusTest
    private double[][] dataSet1 = {{-1.0, -97.0, -2.5}, {98.3}, {68.4, 17.1, 20.0}, {-0.9, 12.2}};
    private double[][] dataSet2 = {{-10.0, 78.2}, {37.5, -21.4, 45.6}, {-12.0, -89.7}, {78.9, 6.3, 45.0}};
    private double[][] dataSet3 = {{69.4}, {93.3, -22.2}, {-99.1, -28.7, 2.5}, {48.2}, {17.1, 13.3}, {-3.6}};


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void testCalculateHolidayBonusSTUDENT() {
        //test for each of your data sets
        double[] array = HolidayBonus.calculateHolidayBonus(dataSet1,5000,1000,2000);
        assertEquals(0.0,array[0],.001);
        assertEquals(5000.0,array[1],.001);
        assertEquals(7000.0,array[2],.001);
        assertEquals(2000.0,array[3],.001);

        array = HolidayBonus.calculateHolidayBonus(dataSet2,5000,1000,2000);
        assertEquals(5000.0,array[0],.001);
        assertEquals(3000.0,array[1],.001);
        assertEquals(0.0,array[2],.001);
        assertEquals(12000.0,array[3],.001);

        array= HolidayBonus.calculateHolidayBonus(dataSet3,5000,1000,2000);
        assertEquals(2000.0,array[0],.001);
        assertEquals(5000.0,array[1],.001);
        assertEquals(5000.0,array[2],.001);
        assertEquals(2000.0,array[3],.001);
    }


    /**
     * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
     */
    @Test
    public void testCalculateTotalHolidayBonusA() {
        //test for each of your data sets
        assertEquals(14000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000),.001);
        assertEquals(20000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet2, 5000, 1000, 2000),.001);
        assertEquals(21000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet3, 5000, 1000, 2000),.001);

    }

    /**
     * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
     */
    @Test
    public void testCalculateTotalHolidayBonusB() {
        //test for each of your data sets
        assertEquals(3000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 1000,250,500),.001);
        assertEquals(4250.0,HolidayBonus.calculateTotalHolidayBonus(dataSet2, 1000,250,500),.001);
        assertEquals(4500.0,HolidayBonus.calculateTotalHolidayBonus(dataSet3, 1000,250,500),.001);

    }

}


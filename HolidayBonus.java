package sample;

public class HolidayBonus {
    public HolidayBonus(){}
    public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
        int i=0;
        double[] bonus = new double[data.length];
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {

                    if (data[r][c] == TwoDimRaggedArrayUtility.getHighestInColumn(data,c)&&data[r][c] >= 0 ) {
                        bonus[r] += high;
                    } else if (data[r][c] == TwoDimRaggedArrayUtility.getLowestInColumn(data,c)&&data[r][c] >= 0 ) {
                        bonus[r] += low;
                    } else if(data[r][c] >= 0 ) {
                        bonus[r] += other;}
                        else
                            bonus[r]+=0;


                }

             }return bonus;
        }




    public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
    {
        double[] bonus = calculateHolidayBonus(data, high, low, other);
        double holidayBonus = 0;
        for (int r = 0; r < bonus.length; r++) {
            holidayBonus += bonus[r];
        }
        return holidayBonus;
    }

    }

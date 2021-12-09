package sample;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility
{
    public TwoDimRaggedArrayUtility()
    {}

    public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException
    {
        String[][] input = new String[10][10];
        Scanner sc = new Scanner(file);
        int r = 0, c = 0;

        while (sc.hasNextLine()) {
            String[] currentRow = sc.nextLine().split(" ");
            for (c = 0; c < currentRow.length; c++) {
                input[r][c] = currentRow[c];
            }
            r++;
        }

        sc.close();

        double[][] sales = new double[r][];

        for (r = 0; r < sales.length; r++) {
            for (c = 0; input[r][c] != null; c++) {	}
            sales[r] = new double[c];
            for (c = 0; c < sales[r].length; c++) {
                sales[r][c] = Double.parseDouble(input[r][c]);
            }
        }

        return sales;
    }
    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
    {
        PrintWriter file = new PrintWriter(outputFile);
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                file.print((c != 0) ? " " + data[r][c] : data[r][c]);
            }
            file.println();
        }

        file.close();
    }



    public static double getTotal(double[][] data)
    {
        double total=0.0;
        for (int r=0; r<data.length;r++)
        {
        for (int c=0; c<data[r].length; c++)
        {
           total+=data[r][c];
        }
        }
        return total;
    }

    public static double getAverage(double[][] data)
    {
        double elementsTotal=0;
        double total=0.0;
        double average=0.0;
        for (int r=0; r<data.length;r++)
        {
            for (int c=0; c<data[r].length; c++)
            {
                total+=data[r][c];
                elementsTotal++;
            }
        }
        average=total/elementsTotal;
        return average;

    }

    public static double getRowTotal(double[][] data, int row)
    {
      double rowTotal=0.0;
      for (int c=0; c<data[row].length; c++)
      {
          rowTotal+=data[row][c];
      }
      return rowTotal;
    }

    public static double getColumnTotal(double[][] data, int col)
    {
        double columnTotal=0.0;
        for (int r=0; r<data.length;r++)
        {
            if (data[r].length>col)
            columnTotal+=data[r][col];
        }
        return columnTotal;
    }

    public static double getHighestInRow(double[][] data, int row)
    {
        double highRow=data[row][0];
        for (int c=1; c<data[row].length; c++)
        {
            if (data[row][c]>highRow)
                highRow=data[row][c];
        }
        return highRow;
    }

    public static int getHighestInRowIndex(double[][] data, int row)
    {
        double highRow=data[row][0];
        int highRowInd=0;
        for (int c=1; c<data[row].length; c++)
        {
            if (data[row][c]>highRow)
            {
                highRow=data[row][c];
                highRowInd=c;
            }

        }
        return highRowInd;
    }

    public static double getLowestInRow(double[][] data, int row)
    {
        double LowRow=data[row][0];
        for (int c=0; c<data[row].length; c++)
        {
            if (data[row][c]<LowRow)
                LowRow=data[row][c];
        }
        return LowRow;
    }

    public static int getLowestInRowIndex(double[][] data, int row)
    {
        double LowRow=data[row][0];
        int LowRowInd=0;
        for (int c=1; c<data[row].length; c++)
        {
            if (data[row][c]<LowRow)
            {
                LowRow=data[row][c];
                LowRowInd=c;
            }

        }
        return LowRowInd;
    }

    public static double getHighestInColumn(double[][] data, int col)
    {

    return data[getHighestInColumnIndex(data, col)][col];
    }


    public static int getHighestInColumnIndex(double[][] data, int col)
    {
        double highCol=0;
        int highColInd=0;
        for(int r=0; r< data.length;r++)
        {
            if (data[r].length>col)
            {
                if (highCol < data[r][col]) {
                    highCol = data[r][col];
                    highColInd = r;
                }
            }
        }
        return highColInd;

    }


    public static double getLowestInColumn(double[][] data, int col)
    {

        return data[getLowestInColumnIndex(data, col)][col];
    }

    public static int getLowestInColumnIndex(double[][] data, int col)
    {
        double LowCol=data[0][col];
        int LowColInd=0;
        for(int r=0; r< data.length;r++)
        {
            if (data[r].length > col )
            {
                if(LowCol>data[r][col])
                {
                    LowCol = data[r][col];
                    LowColInd = r;
                }
            }
        }
        return LowColInd;
    }

    public static double getHighestInArray(double[][] data)
    {
        double highest=data[0][0];
        for (int r=0; r< data.length; r++)
        {
            for(int c=0; c<data[r].length;c++)
            {
                if (highest<data[r][c])
                    highest=data[r][c];
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data)
    {
        double lowest=data[0][0];
        for (int r=0; r< data.length; r++)
        {
            for(int c=1; c<data[r].length;c++)
            {
                if (lowest>data[r][c])
                    lowest=data[r][c];
            }
        }
        return lowest;
    }

}

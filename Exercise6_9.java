class Exercise6_9
{
    //establish conversion factors
    public static final double FT_TO_M_FACTOR = 0.305;
    public static final double M_TO_FT_FACTOR = 3.279;

    /** Convert from feet to meters */
    public static double footToMeter(double foot)
    {
        return(foot * FT_TO_M_FACTOR);
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter)
    {
        return(meter * M_TO_FT_FACTOR);
    }

    public static void main(String []args)
    {
        //create & process the set of values used in the test
        //each item in the array represents one row of the table
        double[][] test_values = new double[10][4];
        for (int i=0; i<10; i++)
        {
            //the numbers are the values listed in the order they will be printed in the table
            test_values[i][0] = i+1;
            test_values[i][1] = footToMeter(test_values[i][0]);
            test_values[i][2] = i*5+20;
            test_values[i][3] = meterToFoot(test_values[i][2]);
        }

        //create the header for the table
        System.out.println("Feet      Meters    |  Meters    Feet      ");
        System.out.println("--------------------+----------------------");
        
        //create the table
        //build it one row at a time
        for (int i=0; i<10; i++)
        {
            //create an output string
            String output = "";

            //place all the numbers into the output string, appropriately padded
            output += String.format("%-10s", test_values[i][0]);
            output += String.format("%-10s", test_values[i][1]);
            output += "|  ";
            output += String.format("%-10s", test_values[i][2]);
            output += String.format("%-10s", test_values[i][3]);

            //print the output for this row
            System.out.println(output);
        }

    }
};

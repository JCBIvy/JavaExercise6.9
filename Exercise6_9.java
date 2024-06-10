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
        //create the set of values used in the test
        //each item in the array represents one part of row of the table
        //the first number in each row corresponds to the feet in the left column in the table, the second to the meters in the right column
        double[][] test_values = new double[10][2];
        for (int i=0; i<10; i++)
        {
            test_values[i][0] = i+1;
            test_values[i][1] = i*5+20;
        }

        //create the header for the table
        

        String output = String.format("%-10s", "foo") + "b";
        System.out.println(output);
    }
};

package com.company;

public class divisible_3 {
    public static int findCount(String number)
    {

        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < number.length(); ++i) {
            sum += number.charAt(i) - 48;
        }

        // Store the answer
        int count = 0;

        // Iterate over the range
        for (int i = 0; i < number.length(); ++i) {

            // Decreasing the sum
            int remaining_sum
                    = sum - (number.charAt(i) - 48);

            // Iterate over the range
            for (int j = 0; j <= 9; ++j) {

                // Checking if the new sum
                // is divisible by 3 or not
                if ((remaining_sum + j) % 3 == 0
                        && j != number.charAt(i) - 48) {

                    // If yes increment
                    // the value of the count
                    ++count;
                }
            }
        }
        if(sum%3==0){
            return count+1;
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given number
        String number = "235";

        findCount(number);
    }
}

package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) throws RuntimeException {
        //Task implementation
        int outputNumber = 0;
        while(inputNumber != 0){
            if (outputNumber >= Integer.MAX_VALUE/10 - inputNumber % 10|| outputNumber <= Integer.MIN_VALUE/10 + inputNumber % 10)
                throw new RuntimeException("Неконвертируемое число!");
            outputNumber = outputNumber * 10 + inputNumber % 10;
            inputNumber /= 10;
        }

        return outputNumber;
    }
}

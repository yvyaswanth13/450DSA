public class DiceRoll {
    
    public static int rollDice() {
        // Get the current time in nanoseconds (this changes constantly)
        long time = System.nanoTime();
        
        // Use the last few digits of time to generate a random number
        int randomNumber = (int)(time % 6); // This gives a number in the range [0, 5]
        
        // Ensure the result is between 1 and 6
        return randomNumber + 1; // Adding 1 shifts the range to [1, 6]
    }

    public static void main(String[] args) {
        // Rolling the dice 10 times as a sample
        for (int i = 0; i < 10; i++) {
            System.out.println(rollDice());
        }
    }
}

public class DiceRoll {
    
    public static int rollDice() {
        // Get the current system time in nanoseconds (since it's constantly changing)
        long currentTime = System.identityHashCode(new Object()); // This gives us a "random" hash code
        
        // We can apply modulo to get a number in the range [1-6]
        return (int)(Math.abs(currentTime % 6) + 1);
    }

    public static void main(String[] args) {
        // Rolling the dice 10 times as a sample
        for (int i = 0; i < 10; i++) {
            System.out.println(rollDice());
        }
    }
}


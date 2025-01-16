package tudelft.numfinder;

public class NumFinder {
    // Smallest is initialized to the maximum possible integer value, ensuring that any number in the input array will be smaller initially.
    private int smallest = Integer.MAX_VALUE;
    
    // Largest is initialized to the minimum possible integer value, ensuring that any number in the input array will be larger initially.
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        for(int n : nums) {

            if(n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}

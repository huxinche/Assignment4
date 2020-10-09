package edu.neu.INFO5100;

public class Test {

    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] ints1 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int[] ints2 = {3, 2, 1, 5, 6, 4};
        
        System.out.println("Test Output 1(k=4): "+kthLargestElement.findKthLargest(ints1, 4));

        System.out.println("Test Output 2(k=2): "+kthLargestElement.findKthLargest(ints2, 2));

    }
}

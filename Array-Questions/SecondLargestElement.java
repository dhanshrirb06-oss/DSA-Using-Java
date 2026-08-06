import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
       int size = arr.length; 
        int largest = arr[0];
       System.out.println("Enter the elements of the array: ");
       for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
      
        for(int i = 0;i<size;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }System.out.println("Largest element in the array is: " + largest);


        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++){
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("Second largest element in the array is: " + secondLargest);
        }
    }
}


/*
------------------------------------Explaination of the code------------------------------------------------------------------------
1. The program starts by importing the Scanner class from the java.util package, which is used to read input from the user.
2. The main method is defined, which is the entry point of the program. 
3. Inside the main method, a Scanner object named 'sc' is created to read input from the user.
4. An integer array 'arr' of size 5 is declared to store the elements entered by the user.
5. The size of the array is stored in the variable 'size'.  
6. The variable 'largest' is initialized with the first element of the array (arr[0]) to keep track of the largest element found so far.
7. The program prompts the user to enter the elements of the array using a for loop that iterates from 0 to size-1. Inside the loop, the user input is read and stored in the array.
8. Another for loop is used to find the largest element in the array. It compares each element of the array with the current value of 'largest'. If a larger element is found, 'largest' is updated with that value.
9. After finding the largest element, the program prints it to the console.
10. The variable 'secondLargest' is initialized with Integer.MIN_VALUE to keep track of the second largest element found so far.
(Why not initialize it to 0?

Suppose the array contains only negative numbers:
int[] nums = {-8, -4, -10};
If you write:

int secondLargest = 0;

then 0 is already greater than every element, so the answer will be incorrect.
But if you write:

int secondLargest = Integer.MIN_VALUE;

then:

-2147483648 < -8 < -4

so the comparisons work correctly for both positive and negative numbers.

Similar constants in Java
Integer.MIN_VALUE   // -2147483648
Integer.MAX_VALUE   // 2147483647

These are commonly used as initial values when finding the largest, smallest, second largest, or second smallest elements in an array.

)

11. A for loop is used to find the second largest element in the array. It compares each element of the array with 'secondLargest' and 'largest'. If an element is greater than 'secondLargest' and less than 'largest', 'secondLargest' is updated with that value.
12. After finding the second largest element, the program checks if 'secondLargest' is still Integer.MIN_VALUE. If it is, it means there is no second largest element in the array, and a message is printed to the console. Otherwise, the second largest element is printed to the console.
13. The program ends after printing the second largest element or the message indicating that there is no second largest element.
*/
import java.util.Scanner;
public class LargestElement {
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
    }
}

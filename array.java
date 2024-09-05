import java.util.*;
class array{
    public static void main(String[] args) {
        int arr[];
        int n,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter numbers: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Numbers are: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

        // int arr[];
        // arr=new int[5];
        // int arr[]=new int[5];
        // int arr[]={10,20,30,40}; 
// An array is a collection of items of the same variable type 
// that are stored at contiguous memory locations.
// Each item in an array is indexed starting with 0 . 
// Each element in an array is accessed through its index.

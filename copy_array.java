import java.util.Scanner;

class copy_array {
    public static void main(String[] args) {
        int arr[],arr2[];
        int n,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter numbers: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr2=arr;
        arr[1]=100;
        System.out.print("Numbers are: ");
        for(i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

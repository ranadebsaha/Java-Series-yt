import java.util.Scanner;

class array_2d {
    public static void main(String[] args) {
        int arr[][];
        int r,c,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of the row: ");
        r=sc.nextInt();
        System.out.println("Enter size of the column: ");
        c=sc.nextInt();
        arr=new int[r][c];
        System.out.print("Enter numbers: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D array is: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
            System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
    }
}

// int arr[][];
// arr=new int[3][3];
// int arr[][]=new int[3][3];
// int arr[2][2]={1,2,3,4};
// int arr[][]={{1,2},{3,4}};

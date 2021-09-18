import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 14;
        int[] arr = new int[size];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 0;
        arr[6] = 0;
        arr[7] = 0;
        arr[8] = 0;
        arr[9] = 0;
        int n = 10;
        System.out.println("mang ban dau :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\nnhap phan tu can chen");
        n = insertToPos(arr,size,n,4,2);
        System.out.println("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
    }

    public static int insertToPos(int[] arr, int size, int n, int x, int postision) {
        //todo neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        //todo vi tri them phan tu phai thuoc khoang [0,n]
        if (postision < 0 || postision > n) {
            return n;
        }
        for (int i = n; i > postision; i--) {
            arr[i] = arr[i - 1];
        }
        //todo them x vao vi tri postision cua mang
        arr[postision] = x;
        return n + 1; //todo tang so luong phan tu cua mang them 1
    }
}

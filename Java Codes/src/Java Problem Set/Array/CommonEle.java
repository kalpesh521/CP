 
public class CommonEle {

    public static void commonelements(int arr1[], int arr2[], int arr3[]) {
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] > arr2[y]) {
                y++;
            } else if (arr2[y] > arr3[z]) {
                z++;
            } else {
                x++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 5, 6, 7, 18, 20 };
        int[] arr2 = { 2, 13, 15, 16, 17, 18, 20 };
        int[] arr3 = { 12, 13, 15, 16, 17, 18, 20 };
        commonelements(arr1, arr2, arr3);
    }
}

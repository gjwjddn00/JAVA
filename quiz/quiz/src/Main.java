import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        //int[] arr = {64, 5, 7, 90, 22, 11, 12}; // 5 7 11 12 22 64 90
        //int[] arr = {10, 7, 8, 9, 1, 5};
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }

        main.quickSort(arr, 0, arr.length - 1);
        System.out.println( main.avg(arr) );
        System.out.println( arr[arr.length / 2] );

    }

    public int avg(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public void quickSort(int[] arr, int low, int high){

        //두 지점이 교차되면 끝냄
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            //재귀호출
            quickSort(arr, low, pivotIndex - 1); //피벗위치보다 작은부분 정렬
            quickSort(arr, pivotIndex + 1, high); //피벗위치보다 큰 부분 정렬
        }
    }

    public int partition(int[] arr, int low, int high){
        //피벗의 결정: 마지막 원소를 피벗
        int pivot = arr[high];
        int i = low - 1; //피벗보다 작은 원소의 인덱스

        for(int j = low; j <= high; j++){ //j는 0부터 배열 마지막 전까지
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j); // 작은 그룹으로 자리이동
            }
        }
        // 피벗을 올바른 위치로 이동 (작은 그룹의 다음번쨰에 피벗을 이동)
        swap(arr, i + 1, high);
        return i + 1;  // 피벗의 최종 위치 반환

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
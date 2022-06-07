import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int thenumber = 0;
        int[]arr = new int[4];
        for (int i = 3;i > 0;i--){
            thenumber = thenumber + (int)(Math.random()*(10-1));
            System.out.println(thenumber);
            thenumber = thenumber * 10;
        }
        System.out.println(thenumber);
        arr = arrCreator(thenumber);
        boolean lastboolean = checksNumber(arr);
        System.out.println(lastboolean);
        boolean answer = false;
        int guess;
        int[]arrGuess = new int[4];
        if (lastboolean == true){
            while (answer == false){
                System.out.println("Guess the four-digit number");
                guess = s.nextInt();
                arrGuess = arrCreator(guess);


            }
        }
    }
    public static int[] boolAndHit(int[]arr, int[]arrGuess){
        int bool = 0, hit = 0;
        int[]arr3 = new int[2];
        for (int i = 0;i < 4;i++){
            for (int j = 0; j < 4;j++){
                if (arr[j] == arrGuess[i] && i == j)
                    bool++;
                else if (arr[i] == arrGuess[j])
                    hit++;
            }
            arr3[0] = bool;
            arr3[1] = hit;
        }

    }
    public static int[] arrCreator(int num){
        int[]arr = new int[4];
        for (int i = 3;i > -1;i--){
            arr[i] = num % 10;
            num = num / 10;
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static boolean checksNumber(int[]arr){
        int count = 0;
        for (int i = 0;i < 4;i++){
            for (int j = i + 1; j < 4;j++) {
                if (arr[i] == arr[j])
                    count++;
            }
        }
        if (count > 0)
            return false;
        else
            return true;
    }
}

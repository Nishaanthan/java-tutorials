package testapplication;
import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i=0;i<10;i++){
           Scanner sr = new Scanner(System.in);
           System.out.println("Enter an Integer number : ");
           int a = sr.nextInt();
           array[i] = a;
        }
        int maximum = 0;
        int maximum2nd = 0;
        for(int i=0;i<10;i++){
            System.out.println(array[i]);
            if(maximum<array[i]){
                maximum = array[i];
            }
        }
        for(int j=0;j<10;j++){
            if(array[j]<maximum && maximum2nd<array[j] ){
                maximum2nd = array[j];
            }
        }
        System.out.println("The maximum is : "+ maximum);
        System.out.println("The 2nd maximum is : "+ maximum2nd);
    }
}


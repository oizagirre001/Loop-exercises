import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        for(int i=0;i<numbers.length/2; i++){
            int temporal= numbers [i];
            numbers [i]=numbers[numbers.length-i-1];
            numbers [numbers.length-i-1]=temporal;
        }
        System.out.println (Arrays.toString(numbers));



    }
}

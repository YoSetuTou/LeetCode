package code;

public class PrimeNum {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("sdsa ");
        for (int i = 2; i < 100; i++) {
            if(isPrimeNum(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("100以内共有素数"+count);
    }
    public static boolean isPrimeNum(int num){
        for (int i = 2; i < num-1; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

public class digitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(77));
        
    }
    public static int sumDigits(int number){
        int result = 0;
        if(number < 0){
            result = -1;
        }
        else if(number< 10) {
            result =  number;
        }
        else {

            while(number != 0){
                result += number % 10;
                number /= 10;
            }
        }
        return result;
    }
}

public class FizzBuzz {
    public String fizzBuzz(int num) {
        String str = new String();
        for(int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                str += "FizzBuzz, ";
            }
            else if(i % 5 == 0) {
                str += "Buzz, ";
            }
            else if(i % 3 == 0) {
                str += "Fizz, ";
            }
            else {
                str += i + ", ";
            }
        }
        return str;
    }
}
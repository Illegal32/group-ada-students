package az.coders.ada_students.lessons.lesson_9.Recursion;

public class Count8Rec {
    public static void main(String[] args) {
        System.out.println(count8(88818878));
    }
    public static int count8(int n) {
//if(n < 0) return 0;
//if (n % 10 == 8 && n % 10 == 8) return 2 + count8(n/10);
//else if(n % 10 == 8) return 1 + count8(n/10);
//else return count8(n/10);
        int count = 0;
        if(n == 0) return 0;
        if(n%10 == 8) {
            if((n/10)%10 == 8){
                count++;
            }
            count++;
        }

        return count + count8(n/10);
    }

}

package az.coders.ada_students.lessons.lesson_9.LeetCode;

public class LeetCodeIPAdress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {

        if ( address.length() < 1) return address;
        if ( address.startsWith(".") )
            return "[.]" + defangIPaddr(address.substring(1));
        return address.charAt(0) + defangIPaddr(address.substring(1));
    }
}

package az.coders.ada_students.lessons.lesson_9.LeetCode;

public class LeetcodeGOAL {
    public static void main(String[] args) {
        System.out.println(interpret("GG()"));
    }

    public static String interpret(String command) {
        if ( command.length() < 2 ) return command;
        if ( command.startsWith("()") ) return "o" + interpret(command.substring(2));
        else if ( command.startsWith("(al)") ) return "al" + interpret(command.substring(4));
        else return command.charAt(0) + interpret(command.substring(1));
    }
}

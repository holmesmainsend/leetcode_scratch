import java.util.List;
import java.util.LinkedList;

public class OneFiveOne {
    public static void main(String[] args) {
        String s = "  hello     world  ";
        List<String> intermediate = new LinkedList<String>();

        String word = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ')
                word += s.charAt(i);
            else {
                intermediate.add(word);
                intermediate.add(" ");
                word = "";
            }
        }
        intermediate.add(word);

        String output = "";
        for(int i = intermediate.size() - 1; i >= 0; i--) {
            output += intermediate.get(i);
        }

        System.out.println(output.trim().replaceAll(" +", " "));
    }   
}
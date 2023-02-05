// import java.util.List;
// import java.util.LinkedList;

// public class OneFiveOne {
//     public static void main(String[] args) {
//         String s = "  hello     world  ";
//         List<String> intermediate = new LinkedList<String>();

//         String word = "";
//         for(int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) != ' ')
//                 word += s.charAt(i);
//             else {
//                 intermediate.add(word);
//                 intermediate.add(" ");
//                 word = "";
//             }
//         }
//         intermediate.add(word);

//         String output = "";
//         for(int i = intermediate.size() - 1; i >= 0; i--) {
//             output += intermediate.get(i);
//         }

//         System.out.println(output.trim().replaceAll(" +", " "));
//     }   
// }

// There are many different potential solutions to this problem. Here are three from three different users that are all more efficient than mine since they do not involve string concatenation:


// Option 1: StringBuilder
// class Solution {
//     public String reverseWords(String s) {        
//         String[] tmp = s.split("\\s");
//         StringBuilder sb = new StringBuilder();
    
//         for(int i = 1; i <= tmp.length; i++){
//     	    if(tmp[tmp.length - i].equals("")){
//     		    continue;
//     	    }
    	
//     	    sb.append(tmp[tmp.length - i]);
//     	    sb.append(" ");
//         }
    
//         return sb.toString().trim();
//     }
// }


// Option 2: Built-In
// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.trim().split(" +");
//         Collections.reverse(Arrays.asList(words));
//         return String.join(" ", words);
//     }
// }


import java.util.Arrays;

// Option 3: Two-Pointers
public class OneFiveOne {
    public static void main(String[] args) {
        String s = "the sky is blue";

        if (s == null) System.out.println("null");
        char[] a = s.toCharArray();
        System.out.println(Arrays.toString(a));
        System.out.println(a[4]);
        int n = a.length;
      
      // step 1. reverse the whole string
      reverse(a, 0, n - 1);
      // step 2. reverse each word
      reverseWords(a, n);
      // step 3. clean up spaces
      System.out.println(cleanSpaces(a, n));
    }

    static void reverseWords(char[] a, int n) {
      System.out.println(Arrays.toString(a));
      System.out.println(a[4]);
          int i = 0, j = 0;
          System.out.println("n is: " + n);
          while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; // skip spaces
            System.out.println("i is: " + i);
            while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
            System.out.println("j is: " + j);
            if(j < n) {
              System.out.println("a[4] is: " + a[4]);
              System.out.println("a[j] is: " + a[j]);
            }
            reverse(a, i, j - 1);                      // reverse the word
          }
    }
    
    // trim leading, trailing and multiple spaces
    static String cleanSpaces(char[] a, int n) {
      int i = 0, j = 0;
        
      while (j < n) {
        while (j < n && a[j] == ' ') j++;             // skip spaces
        while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
        while (j < n && a[j] == ' ') j++;             // skip spaces
        if (j < n) a[i++] = ' ';                      // keep only one space
      }
    
      return new String(a).substring(0, i);
    }

    // reverse a[] from a[i] to a[j]
    private static void reverse(char[] a, int i, int j) {
      while (i < j) {
        char t = a[i];
        a[i++] = a[j];
        a[j--] = t;
      }
    }
}

// LeetCode Version:
// public class Solution {
//     public String reverseWords(String s) {
//       if (s == null) return null;
      
//       char[] a = s.toCharArray();
//       int n = a.length;
      
//       // step 1. reverse the whole string
//       reverse(a, 0, n - 1);
//       // step 2. reverse each word
//       reverseWords(a, n);
//       // step 3. clean up spaces
//       return cleanSpaces(a, n);
//     }
    
//     void reverseWords(char[] a, int n) {
//       int i = 0, j = 0;
        
//       while (i < n) {
//         while (i < j || i < n && a[i] == ' ') i++; // skip spaces
//         while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
//         reverse(a, i, j - 1);                      // reverse the word
//       }
//     }
    
//     // trim leading, trailing and multiple spaces
//     String cleanSpaces(char[] a, int n) {
//       int i = 0, j = 0;
        
//       while (j < n) {
//         while (j < n && a[j] == ' ') j++;             // skip spaces
//         while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
//         while (j < n && a[j] == ' ') j++;             // skip spaces
//         if (j < n) a[i++] = ' ';                      // keep only one space
//       }
    
//       return new String(a).substring(0, i);
//     }
    
//     // reverse a[] from a[i] to a[j]
//     private void reverse(char[] a, int i, int j) {
//       while (i < j) {
//         char t = a[i];
//         a[i++] = a[j];
//         a[j--] = t;
//       }
//     }
// }
import java.util.*;

public class VowelsConsonents{

  public static int[] findVowelsConsonents(String s){
    int[] count = new int[2];
    String str = s.toLowerCase();

    for (int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z'){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          count[0]++;
        } else{
          count[1]++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int[] count = findVowelsConsonents(str);

    System.out.println("Vowels: " + count[0]);
    System.out.println("Consonents: " + count[1]);
  }
}
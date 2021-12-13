
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, String> myMap = new HashMap<>();
        String fName, sNum;
        String remove3rd = "";
        for (int i = 0; i < 3; i++) {
            int ii = i + 1;
            System.out.print("Enter student Number " + ii + " : ");
            fName = s.nextLine();
            System.out.print("Enter first Name     " + ii + " : ");
            sNum = s.nextLine();
            myMap.put(sNum, fName);
            if (i == 2) remove3rd = sNum;
        }
        System.out.println("Student List: "+"\n");

        myMap.entrySet().forEach(e -> {
            System.out.println(e.getValue() + " " + e.getKey());
        });

        myMap.remove(remove3rd);
        System.out.print("\n"+"Enter student Number  : ");
        fName = s.nextLine();
        System.out.print("Enter first Name      : ");
        sNum = s.nextLine();
        myMap.put(sNum, fName);
        
        System.out.println("\n" + " Students List");
        myMap.entrySet().forEach(e -> {
            System.out.println(e.getValue() + " " + e.getKey());
        });

    }
}

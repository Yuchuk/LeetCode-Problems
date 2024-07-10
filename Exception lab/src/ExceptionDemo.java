import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {
    public static void main(String[] args) {
        strFunction();
    }

    private static void strFunction() {

        String name = "bbt";
        String name2 = "bbt";

        System.out.println("1 - " + name.equals(name2));
        System.out.println(name == "bbt");
        System.out.println("3 - " + name.equals("bbt"));
        System.out.println("4 - " + (name == name2));

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add();
    }

}

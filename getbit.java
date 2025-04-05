import java.util.*;
public class getbit {

    public static void main(String[] args) {
        int n = 5;
        int position = 3;
        int bitmask = 1<< position;

        if((bitmask & n) == 0){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit Was one");
        }
    }
}
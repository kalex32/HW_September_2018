package DZ2_Collections;

import java.util.Scanner;

public class RunDev {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scannerRunDev = new Scanner(System.in);

//        Developer developer1 = new Developer(scannerRunDev.next(), true, true,
//                false,true, true,
//                false,true,true,2);

        Developer developer2=new Developer(scannerRunDev.next());
        System.out.println(developer2.toString());

    }
}

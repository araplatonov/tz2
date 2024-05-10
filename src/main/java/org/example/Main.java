package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static long _sum(ArrayList<Long> arr) {
        long s = 0;
        for(int i = 0; i < arr.size(); i++) {
            s += arr.get(i);
        }
        return s;
    }
    public static long _min(ArrayList<Long> arr) {
        if(arr.size() == 0) {
            return 0;
        }
        long m = arr.get(0);

        for(int i = 1; i < arr.size(); i++) {
            long n = arr.get(i);
            if(n < m) {
                m = n;
            }
        }

        return m;
    }
    public static long _max(ArrayList<Long> arr) {
        if(arr.size() == 0) {
            return 0;
        }

        long m = arr.get(0);

        for(int i = 1; i < arr.size(); i++) {
            long n = arr.get(i);
            if(n > m) {
                m = n;
            }
        }

        return m;
    }
    public static long _mult(ArrayList<Long> arr) {
        if(arr.size() == 0) {
            return 0;
        }

        long m = 1;

        for(int i = 0; i < arr.size(); i++) {
            m *= arr.get(i);
        }

        return m;
    }

    public static void main(String[] args) {

        try {
            File file = new File("abc.txt");
            Scanner scanner = new Scanner(file);

            ArrayList<Long> arr = new ArrayList<Long>();

            while (scanner.hasNext()) {
                long n = scanner.nextInt();
                arr.add(n);
            }

            System.out.println(_min(arr));
            System.out.println(_max(arr));
            System.out.println(_sum(arr));
            System.out.println(_mult(arr));
        } catch (Exception e) {
            System.out.println("file read error");
        }
    }
}
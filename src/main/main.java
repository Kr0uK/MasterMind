package main;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 01/09/2016.
 */
public class main {
    public static void main(String[] args) {


        Pattern regex_num = Pattern.compile("^([\\d]){5}$");
        Pattern regex_tel = Pattern.compile("^(0)([1-59])(\\d{8})$");
        Pattern regex_mobile = Pattern.compile("^(0)([6-7])(\\d{8})$");
        Matcher m;

        double test = 0;
        long test2 = 10000000000;
        Random rnd = new Random();

        while (1 > 0){
            test = rnd.nextLong(10000000000);
            m = regex_tel.matcher(""+test);
            if (m.find()) {
                System.out.println("ok " + test);
        }
    }





}}



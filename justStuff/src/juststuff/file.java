/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juststuff;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;

public class file {

    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hi";
        int x = str2.compareTo(str1);
        //System.out.println(x);
        
        StringBuffer str = new StringBuffer("Hello baby");
        str.delete(0, 2);
        System.out.println(str);
    }
}

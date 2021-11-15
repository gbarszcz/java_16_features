package org.gb.patternmatching;

public class PatternMatching {

    public static void oldWay(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 3) {
                System.out.println("I am a String object = " + s);
            }
        } else if (obj instanceof StringBuilder) {
            StringBuilder s = (StringBuilder) obj;
            System.out.println("I am a StringBuilder object = " + s);
        }
    }

    public static void newWay(Object obj) {
        if (obj instanceof String s && s.length() > 3) {
            System.out.println("I am a String object = " + s);
        } else if (obj instanceof StringBuilder s) {
            System.out.println("I am a StringBuilder object = " + s);
        }
    }

}

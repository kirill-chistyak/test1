package main.java.util;

import main.java.exceptions.FailedValidationException;

public class Validator {

    public static void isTrue(Boolean condition, String message){
        try {
            if (!condition) throw new FailedValidationException(message);
        } catch (FailedValidationException fve){
            fve.printStackTrace();
            System.exit(-1);
        }
    }
    public static void isFalse(Boolean condition, String message){
        try {
            if (condition) throw new FailedValidationException(message);
        } catch (FailedValidationException fve){
            fve.printStackTrace();
            System.exit(-1);
        }
    }
    public static void isNull(Object condition, String message){
        try {
            if (condition == null) throw new FailedValidationException(message);
        } catch (FailedValidationException fve){
            fve.printStackTrace();
            System.exit(-1);
        }
    }
    public static void areEqual(Object condition1, Object condition2, String message){
        try {
            if (!condition1.equals(condition2)) throw new FailedValidationException(message);
        } catch (FailedValidationException fve){
            fve.printStackTrace();
            System.exit(-1);
        }
    }
    public static void areNotEqual(Object condition1, Object condition2, String message){
        try {
            if (condition1.equals(condition2)) throw new FailedValidationException(message);
        } catch (FailedValidationException fve){
            fve.printStackTrace();
            System.exit(-1);
        }
    }
}

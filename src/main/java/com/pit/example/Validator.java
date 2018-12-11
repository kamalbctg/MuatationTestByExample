package com.pit.example;

public class Validator {

    public void validate(boolean registableStateisNotNull, boolean registableStateEnabled, boolean registableStateDisEnabled) {
        if (registableStateisNotNull == false) {
            System.out.print("B");
        }


        if (registableStateEnabled &&
                registableStateDisEnabled) {
            System.out.print("B");
        }
    }
}
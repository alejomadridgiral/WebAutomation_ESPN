package com.espn.training.Data;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name="User")
    public static Object [][] inputData(){return new Object[][] {{"Alejo"},{"Zazu"}, {"Mambo"}}; }

}
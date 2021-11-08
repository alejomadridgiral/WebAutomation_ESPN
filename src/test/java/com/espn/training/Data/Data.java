package com.espn.training.Data;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name="User")
    public static Object [][] inputData(){return new Object[][] {{"alejandro.madrid2@globant.com"},{"alejandro.madrid3@globant.com"}, {"alejandro.madrid4@globant.com"}}; }

}

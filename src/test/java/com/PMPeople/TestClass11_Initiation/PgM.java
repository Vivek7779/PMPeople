package com.PMPeople.TestClass11_Initiation;

import java.io.IOException;

import org.junit.Test;

import Resources.BaseClass;

public class PgM extends BaseClass {

    @Test
    public void PgM () throws IOException, InterruptedException {
         driverinitialize();
         maximizeWindow();
         performLogin("admin11@dummy.com", "Admin@123");
         

    }
}

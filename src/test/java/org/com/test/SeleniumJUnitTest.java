/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.com.test;

import com.org.automation.TestCaseLoginController;
import com.org.automation.TestCaseRegisterController;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


/**
 *
 * @author K94LAB
 */
public class SeleniumJUnitTest {
    
    private TestCaseRegisterController testCaseRegisterController;
    private TestCaseLoginController testCaseLoginController;
    
    public SeleniumJUnitTest() {
        testCaseRegisterController=new TestCaseRegisterController();
        testCaseLoginController=new TestCaseLoginController();
    }

    @BeforeClass
    public void setUpClass() {
        this.testCaseRegisterController.start();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }



}
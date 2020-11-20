package com.lti.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestWelcome {

	@Test
	public void testShow() {        
        Welcome w= new Welcome();        
        assertEquals("Hello",w.Show());
    }

}

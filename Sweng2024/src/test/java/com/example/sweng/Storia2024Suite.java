package com.example.sweng;

import com.example.sweng.client.Storia2024Test;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class Storia2024Suite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for Storia2024");
    suite.addTestSuite(Storia2024Test.class);
    return suite;
  }
}

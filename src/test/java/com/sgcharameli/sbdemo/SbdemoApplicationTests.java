package com.sgcharameli.sbdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbdemoApplicationTests {

  @Test
  void contexLoadRunMain() {
    SbdemoApplication.main(new String[] {});
    assertTrue(Boolean.TRUE);
  }
}

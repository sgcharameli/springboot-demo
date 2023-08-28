package com.sgcharameli.sbdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SbdemoApplicationTests {

  @Test
  void contexLoadRunMain() {
    SbdemoApplication.main(new String[] {});
    Assert.isTrue(Boolean.TRUE, "Just context loaded");
  }
}

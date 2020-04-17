package com.sean.demo

import com.sean.demo.index.IndexController
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    lateinit var indexController: IndexController

    @Test
    fun contextLoads() {
        indexController.index()
    }

}

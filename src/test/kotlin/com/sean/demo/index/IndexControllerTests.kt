package com.sean.demo.index

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class IndexControllerTests {

    @Autowired
    lateinit var indexController: IndexController

    @Test
    fun index() {
        print(indexController.index())
    }

}
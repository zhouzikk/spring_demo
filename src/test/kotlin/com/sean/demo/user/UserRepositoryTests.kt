package com.sean.demo.user

import com.sean.demo.user.dao.UserRepository
import com.sean.demo.user.entity.UserBean
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserRepositoryTests {
    @Autowired
    lateinit var repository: UserRepository

    @Test
    fun addUser() {
        repeat(10) {
            print(repository.insert(UserBean("sean${it}", "password")))
        }
    }

    @Test
    fun delete() {
        print(repository.findAll().toString())
        repository.deleteByUsername("sean")
        print(repository.findAll().toString())
    }

    @Test
    fun find() {
        print(repository.findUserBeanByUsername("sean"))
    }
}
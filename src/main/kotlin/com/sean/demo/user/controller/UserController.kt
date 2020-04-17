package com.sean.demo.user.controller

import com.sean.demo.user.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/user")
class UserController {
    @Autowired
    private lateinit var userRepository: UserRepository

    @PostMapping("/register")
    fun register(username: String, password: String) {

    }
}
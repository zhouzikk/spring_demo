package com.sean.demo.user.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document("user")
data class UserBean(val username: String, val password: String)
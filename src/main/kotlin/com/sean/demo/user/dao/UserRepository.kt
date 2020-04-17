package com.sean.demo.user.dao

import com.sean.demo.user.entity.UserBean
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<UserBean, Long> {
    fun findUserBeanByUsername(username: String): UserBean

    fun deleteByUsername(username: String)

    override fun <S : UserBean?> insert(entity: S): S {

        return insert(entity)
    }
}
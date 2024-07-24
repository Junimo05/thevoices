package com.example.thevoices.data.repository

import com.example.thevoices.data.db.Dao.UserLoginDAO
import com.example.thevoices.data.db.Entity.UserLogin
import javax.inject.Inject

class UserLoginRepository @Inject constructor(
    private val userLoginDao: UserLoginDAO
) {
    suspend fun insertUser(user: UserLogin) {
        userLoginDao.insertUser(user)
    }

    suspend fun updateUser(user: UserLogin) {
        userLoginDao.updateUser(user)
    }

    suspend fun deleteUser(user: UserLogin) {
        userLoginDao.deleteUser(user)
    }

    fun getAllUsers() = userLoginDao.getAllUsers()

    fun getUserByUsername(username: String) = userLoginDao.getUserByUsername(username)
}
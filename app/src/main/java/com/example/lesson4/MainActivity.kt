package com.example.lesson4

/*
Реализация списков через RecyclerView
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.adapter.UserAdapter
import com.example.lesson4.databinding.ActivityMainBinding
import com.example.lesson4.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapter = UserAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel> {
        val userList = ArrayList<UserModel>()

        val user = UserModel("Petrov", "Vasya")
        userList.add(user)
        val user2 = UserModel("Trofimov", "Vlad")
        userList.add(user2)
        val user3 = UserModel("Seryakov", "Nikita")
        userList.add(user3)
        val user4 = UserModel("Yanukov", "Maksim")
        userList.add(user4)

        return userList
    }


}
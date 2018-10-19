package com.mybossseasonfinal.justthejob.Models

data class Worker(
        val _id: String,
        val id: Int,
        val company_id: Int,
        val name: String,
        val age: Int,
        val position: String,
        val join_company: Int,
        val working_length: Int,
        val self_introduction: String,
        val business_outline: String,
        val holiday: String,
        val img_path: String

)
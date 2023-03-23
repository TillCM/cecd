package com.example.cecd.Models

data class AssignedUser(
    val ID: Int,
    val comment_count: String,
    val comment_status: String,
    val comments: Boolean,
    val guid: String,
    val id: Int,
    val menu_order: Int,
    val ping_status: String,
    val pinged: String,
    val post_author: String,
    val post_content: String,
    val post_content_filtered: String,
    val post_date: String,
    val post_date_gmt: String,
    val post_excerpt: String,
    val post_mime_type: String,
    val post_modified: String,
    val post_modified_gmt: String,
    val post_name: String,
    val post_parent: Int,
    val post_password: String,
    val post_status: String,
    val post_title: String,
    val post_type: String,
    val related_to: List<Int>,
    val to_ping: String,
    val video: String,
    val upload_video: String

)
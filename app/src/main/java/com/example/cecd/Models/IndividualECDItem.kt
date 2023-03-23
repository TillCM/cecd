package com.example.cecd.Models

data class IndividualECDItem(
    val _links: Links,
    val assigned_user: List<AssignedUser>,
    val avatar_urls: AvatarUrls,
    val description: String,
    val id: Int,
    val link: String,
    val meta: List<Any>,
    val name: String,
    val slug: String,
    val url: String
)
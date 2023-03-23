package com.example.cecd.Retrofit


import com.example.cecd.Models.AssignedUser
import com.example.cecd.Models.IndividualECD
import com.example.cecd.Models.IndividualECDItem
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface IAPI
{

    @GET("/wp-json/wp/v2/ecd-resource")
    fun getECDActivities(): Observable<IndividualECD>

    @GET("/wp-json/wp/v2/users/")
    fun getUserECD(@Query("search") Username: String?): Observable<ArrayList<IndividualECDItem>>
}
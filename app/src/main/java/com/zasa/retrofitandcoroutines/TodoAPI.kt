package com.zasa.retrofitandcoroutines

import retrofit2.Response

/**
 **@Project -> RetrofitAndCoroutines
 **@Author -> Sangeeth on 6/28/2022
 */
interface TodoAPI {
    fun getTodo() : Response<>
}
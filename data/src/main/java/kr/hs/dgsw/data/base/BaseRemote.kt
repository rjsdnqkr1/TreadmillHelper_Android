package kr.hs.dgsw.data.base

import io.reactivex.functions.Function
import org.json.JSONObject

abstract class BaseRemote<V> {
    abstract val api: V

    protected fun <T> getResponse(): Function<retrofit2.Response<T>, T> {
        return Function { response: retrofit2.Response<T> ->
            checkError(response)
            response.body()!!
        }
    }

    private fun checkError(response: retrofit2.Response<*>) {
        if (!response.isSuccessful) {
            val errorBody = JSONObject(response.errorBody()!!.string())
            throw Throwable(errorBody.getString("message"))
        }
    }
}
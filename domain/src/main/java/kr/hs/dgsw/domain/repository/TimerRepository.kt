package kr.hs.dgsw.domain.repository

import io.reactivex.Observable

interface TimerRepository {
    fun countDownTime(partTime: Long): Observable<Int>
}
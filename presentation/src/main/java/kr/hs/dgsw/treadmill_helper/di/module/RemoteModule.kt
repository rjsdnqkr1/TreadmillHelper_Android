package kr.hs.dgsw.treadmill_helper.di.module

import dagger.Module
import dagger.Provides
import kr.hs.dgsw.data.network.remote.ScheduleRemote
import kr.hs.dgsw.data.network.remote.ScheduleRemoteImpl
import javax.inject.Singleton

@Module
class RemoteModule {
    @Singleton
    @Provides
    fun provideScheduleRemote(scheduleRemoteImpl: ScheduleRemoteImpl): ScheduleRemote = scheduleRemoteImpl
}
package kr.hs.dgsw.treadmill_helper.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kr.hs.dgsw.treadmill_helper.di.scope.PerDialog
import kr.hs.dgsw.treadmill_helper.ui.routine.add.RoutineAddDialog
import kr.hs.dgsw.treadmill_helper.ui.routine.list.RoutineListDialog

@Module
abstract class DialogBindingModule {
    @PerDialog
    @ContributesAndroidInjector
    abstract fun bindingRoutineListDialog(): RoutineListDialog

    @PerDialog
    @ContributesAndroidInjector
    abstract fun bindingRoutineAddDialog(): RoutineAddDialog
}
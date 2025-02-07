package com.example.mytaskboard.di

import com.example.mytaskboard.core.domain.LoadResult
import com.example.mytaskboard.taskboard.main.data.BaseTasksRepository
import com.example.mytaskboard.taskboard.main.domain.TaskItem
import com.example.mytaskboard.taskboard.main.domain.TaskRepository
import com.example.mytaskboard.taskboard.main.presentation.BaseTasksLoadResultMapper
import com.example.mytaskboard.taskboard.main.presentation.TaskItemToTaskUiMapper
import com.example.mytaskboard.taskboard.main.presentation.TasksLiveDataWrapper
import com.example.mytaskboard.taskboard.main.presentation.adapter.TaskUi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class TaskBoardModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsTaskRepository(repository: BaseTasksRepository): TaskRepository

    @Binds
    @ViewModelScoped
    abstract fun bindResultMapper(mapper: BaseTasksLoadResultMapper): LoadResult.Mapper<TaskItem>

    @Binds
    @ViewModelScoped
    abstract fun bindTasksCommunication(communication: TasksLiveDataWrapper.Base): TasksLiveDataWrapper

    @Binds
    @ViewModelScoped
    abstract fun bindTaskItemToTaskUiMapper(mapper: TaskItemToTaskUiMapper): TaskItem.Mapper<TaskUi>
}
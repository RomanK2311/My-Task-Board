package com.example.mytaskboard.di

import com.example.mytaskboard.core.domain.LoadResult
import com.example.mytaskboard.taskboard.details.data.BaseTaskDetailsRepository
import com.example.mytaskboard.taskboard.details.domain.TaskDetailsRepository
import com.example.mytaskboard.taskboard.details.presentation.TaskDetailsLiveDataWrapper
import com.example.mytaskboard.taskboard.details.presentation.TaskDetailsUiModel
import com.example.mytaskboard.taskboard.details.presentation.ToTaskDetailsUiModelMapper
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
abstract class TaskDetailsModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsTaskDetailsRepository(repository: BaseTaskDetailsRepository): TaskDetailsRepository

    @Binds
    @ViewModelScoped
    abstract fun mapper(mapper: ToTaskDetailsUiModelMapper): TaskItem.Mapper<TaskDetailsUiModel>

    @Binds
    @ViewModelScoped
    abstract fun bindTaskDetailsLiveDataWrapper(liveDataWrapper: TaskDetailsLiveDataWrapper.Base): TaskDetailsLiveDataWrapper
}
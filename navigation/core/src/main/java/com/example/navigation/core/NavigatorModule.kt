package com.example.navigation.core

import com.example.feature1.Feature1NavigatorImpl
import com.example.feature2.Feature2NavigatorImpl
import com.example.main.MainNavigatorImpl
import com.example.navigation.feature1.Feature1Navigator
import com.example.navigation.feature2.Feature2Navigator
import com.example.navigation.main.MainNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigatorModule {

    @Provides
    @Singleton
    fun provideMainNavigator(): MainNavigator = MainNavigatorImpl()

    @Provides
    @Singleton
    fun provideFeature1Navigator(): Feature1Navigator = Feature1NavigatorImpl()

    @Provides
    @Singleton
    fun provideFeature2Navigator(): Feature2Navigator = Feature2NavigatorImpl()
}
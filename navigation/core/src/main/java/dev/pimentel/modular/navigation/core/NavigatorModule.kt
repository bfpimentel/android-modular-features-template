package dev.pimentel.modular.navigation.core

import dev.pimentel.modular.feature1.Feature1NavigatorImpl
import dev.pimentel.modular.feature2.Feature2NavigatorImpl
import dev.pimentel.modular.main.MainNavigatorImpl
import dev.pimentel.modular.navigation.feature1.Feature1Navigator
import dev.pimentel.modular.navigation.feature2.Feature2Navigator
import dev.pimentel.modular.navigation.main.MainNavigator
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
package ca.nick.multimodulenavigation.di

import androidx.fragment.app.FragmentFactory
import ca.nick.list.OnItemClicked
import ca.nick.multimodulenavigation.AppFragmentFactory
import ca.nick.multimodulenavigation.OnItemClickedDirections
import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {
    @Binds
    abstract fun onItemClicked(onItemClickedDirections: OnItemClickedDirections): OnItemClicked

    @Binds
    abstract fun fragmentFactory(appFragmentFactory: AppFragmentFactory): FragmentFactory
}
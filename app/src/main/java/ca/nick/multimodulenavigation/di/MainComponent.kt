package ca.nick.multimodulenavigation.di

import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import dagger.BindsInstance
import dagger.Subcomponent

@MainScope
@Subcomponent(
    modules = [
        MainModule::class,
        FragmentsModule::class
    ]
)
interface MainComponent {

    val fragmentFactory: FragmentFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance fragmentManager: FragmentManager): MainComponent
    }
}
package ca.nick.multimodulenavigation.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        SubcomponentsModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun application(@BindsInstance application: Application): AppComponent
    }

    fun mainComponentFactory(): MainComponent.Factory
}
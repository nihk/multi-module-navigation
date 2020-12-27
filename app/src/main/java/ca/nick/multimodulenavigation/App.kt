package ca.nick.multimodulenavigation

import android.app.Application
import ca.nick.multimodulenavigation.di.AppComponent
import ca.nick.multimodulenavigation.di.AppComponentProvider
import ca.nick.multimodulenavigation.di.DaggerAppComponent

@Suppress("unused")
class App : Application(), AppComponentProvider {

    override val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .factory()
            .application(this)
    }
}
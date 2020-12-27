package ca.nick.multimodulenavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ca.nick.list.ListFragment
import ca.nick.multimodulenavigation.di.AppComponentProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = (application as AppComponentProvider).appComponent
            .mainComponentFactory()
            .create(supportFragmentManager)
            .fragmentFactory

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentByTag("list") == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListFragment::class.java, null, "list")
                .commit()
        }
    }
}
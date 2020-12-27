package ca.nick.multimodulenavigation.di

import androidx.fragment.app.Fragment
import ca.nick.detail.DetailFragment
import ca.nick.list.ListFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentsModule {
    @Binds
    @IntoMap
    @FragmentKey(ListFragment::class)
    abstract fun listFragment(listFragment: ListFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(DetailFragment::class)
    abstract fun detailFragment(detailFragment: DetailFragment): Fragment
}
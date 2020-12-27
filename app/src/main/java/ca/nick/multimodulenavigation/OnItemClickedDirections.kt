package ca.nick.multimodulenavigation

import androidx.fragment.app.FragmentManager
import ca.nick.detail.DetailFragment
import ca.nick.list.OnItemClicked
import javax.inject.Inject

class OnItemClickedDirections @Inject constructor(
    private val fragmentManager: FragmentManager
) : OnItemClicked {

    override fun onItemClicked() {
        fragmentManager.beginTransaction()
            .replace(R.id.container, DetailFragment())
            .addToBackStack(null)
            .commit()
    }
}
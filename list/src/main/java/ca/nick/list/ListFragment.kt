package ca.nick.list

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import javax.inject.Inject

class ListFragment @Inject constructor(
    private val onItemClicked: OnItemClicked,
    @Suppress("unused")
    private val someHeavyWeightDependency: SomeHeavyWeightDependency
) : Fragment(R.layout.list_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.item4).setOnClickListener {
            onItemClicked.onItemClicked()
        }
    }
}
package com.and.and

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdFragment : Fragment() {

    private lateinit var adapter : Adapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemArrayList : ArrayList<Item>

    lateinit var imageId : Array<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = Adapter(itemArrayList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object: Adapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val message = when (position) {
                    0 -> "1 (первый)"
                    1 -> "2 (второй)"
                    2 -> "3 (третий)"
                    3 -> "4 (четвертый)"
                    4 -> "5 (пятый)"
                    5 -> "6 (шестой)"
                    6 -> "7 (седьмой)"
                    7 -> "8 (восьмой)"
                    8 -> "9 (девятый)"
                    9 -> "10 (десятый)"
                    else -> "unknown"
                }
                showDialog(message)
            }
        })
    }

    private fun dataInitialize() {

        itemArrayList = arrayListOf<Item>()

        imageId = arrayOf(
            R.drawable.baseline_filter_1_24,
            R.drawable.baseline_filter_2_24,
            R.drawable.baseline_filter_3_24,
            R.drawable.baseline_filter_4_24,
            R.drawable.baseline_filter_5_24,
            R.drawable.baseline_filter_6_24,
            R.drawable.baseline_filter_7_24,
            R.drawable.baseline_filter_8_24,
            R.drawable.baseline_filter_9_24,
            R.drawable.baseline_filter_9_plus_24,
        )

        for (i in imageId.indices){
            val item = Item(imageId[i])
            itemArrayList.add(item)
        }
    }

    private fun showDialog(message: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage(message).show()
    }
}
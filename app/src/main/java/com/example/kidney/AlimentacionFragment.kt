package com.example.kidney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.adapter.Dialisis.AlimentacionAdapter
import com.example.kidney.adapter.Dialisis.DialisisAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlimentacionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlimentacionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista:View = inflater.inflate(R.layout.fragment_alimentacion, container, false)
        val recyclerViewAlimentacion = vista.findViewById<RecyclerView>(R.id.recyclerAlimentacion)

        recyclerViewAlimentacion.layoutManager = LinearLayoutManager(context)
        recyclerViewAlimentacion.adapter = AlimentacionAdapter(AlimentacionProvider.alimentacionList)

        //fragment preescripcion
//        var preescripcion = R.id.



        return vista
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AlimentacionFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlimentacionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
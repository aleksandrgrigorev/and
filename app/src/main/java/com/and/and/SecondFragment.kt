package com.and.and

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.and.and.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSecondBinding.inflate(layoutInflater)
        inflater.inflate(R.layout.fragment_second, container, false)

        binding.editText.onTextChangedListener{
            toast(it)
        }
        return binding.root
    }

    private fun EditText.onTextChangedListener(listener: (String) -> Unit) {
        this.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Auto-generated method stub
            }
            override fun onTextChanged(charSequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                listener(charSequence.toString())
            }
            override fun afterTextChanged(p0: Editable?) {
                // Auto-generated method stub
            }
        })
    }

    private fun toast(text: String) {
        Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
    }
}
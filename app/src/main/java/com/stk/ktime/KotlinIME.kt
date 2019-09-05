package com.stk.ktime

import android.inputmethodservice.InputMethodService
import android.view.View
import androidx.databinding.DataBindingUtil
import com.stk.ktime.databinding.KeyboardBinding

class KotlinIME : InputMethodService() {
    // returns main keyboard layout
    override fun onCreateInputView(): View {
        val binding = DataBindingUtil.inflate<KeyboardBinding>(layoutInflater, R.layout.keyboard, null, false)
        binding.button.setOnClickListener {
            /**
             * newCursorPosition
             * 1 : end of the inserted text
             * 0 : start of the inserted text
             */
            currentInputConnection.commitText(getString(R.string.hello), -1)
        }
        return binding.root
    }
}

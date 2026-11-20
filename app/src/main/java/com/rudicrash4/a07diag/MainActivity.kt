package com.rudicrash4.a07diag

import android.app.Activity
import android.os.Bundle
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val basePadding = (24 * resources.displayMetrics.density).toInt()

        val titleView = TextView(this).apply {
            text = getString(R.string.stage1_title)
            textSize = 24f
        }

        val bodyView = TextView(this).apply {
            text = getString(R.string.stage1_body)
            textSize = 16f
        }

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(basePadding, basePadding, basePadding, basePadding)
            addView(titleView)
            addView(bodyView)
            setOnApplyWindowInsetsListener { view, insets ->
                val bars = insets.getInsets(WindowInsets.Type.systemBars())
                view.setPadding(
                    basePadding + bars.left,
                    basePadding + bars.top,
                    basePadding + bars.right,
                    basePadding + bars.bottom
                )
                insets
            }
        }

        setContentView(root)
    }
}

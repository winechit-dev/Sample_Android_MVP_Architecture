package com.wcp.androidmvparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wcp.androidmvparchitecture.view.BasicView
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast
import com.wcp.androidmvparchitecture.model.BasicModel
import com.wcp.androidmvparchitecture.presenter.BasicPresenter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), BasicView{
    private lateinit var basicPresenter: BasicPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        basicPresenter=  BasicModel(this)

        btn.setOnClickListener {
            basicPresenter.clickMe()
        }
    }

    override fun clickSuccess(text: String) {
        Toast.makeText(this,text,Toast.LENGTH_LONG).show()
    }
}

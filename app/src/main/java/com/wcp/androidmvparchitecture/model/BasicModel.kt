package com.wcp.androidmvparchitecture.model

import com.wcp.androidmvparchitecture.presenter.BasicPresenter
import com.wcp.androidmvparchitecture.view.BasicView

class BasicModel : BasicPresenter  {
    val helloTag= "Hello Workd!"
    private lateinit var basicView: BasicView

    constructor(basicView: BasicView) {
        this.basicView = basicView
    }

    override fun clickMe() {
        basicView.clickSuccess(helloTag)
    }


}
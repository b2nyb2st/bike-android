package com.gitturami.bike.view.intro.presenter

import com.gitturami.bike.view.intro.base.BasePresenter
import com.gitturami.bike.view.intro.base.BaseView

interface IntroContact {
    interface View: BaseView {

    }
    interface Presenter: BasePresenter {
        fun takeView(view: View)
        fun changeActivity()
//        fun dropView()
    }
}
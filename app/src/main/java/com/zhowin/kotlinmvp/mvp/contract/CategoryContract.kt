package com.zhowin.kotlinmvp.mvp.contract

import com.zhowin.kotlinmvp.base.IBaseView
import com.zhowin.kotlinmvp.base.IPresenter
import com.zhowin.kotlinmvp.mvp.model.bean.CategoryBean

/**
 * Created by xuhao on 2017/11/29.
 * desc: 分类 契约类
 */
interface CategoryContract {

    interface View : IBaseView {
        /**
         * 显示分类的信息
         */
        fun showCategory(categoryList: ArrayList<CategoryBean>)

        /**
         * 显示错误信息
         */
        fun showError(errorMsg:String,errorCode:Int)
    }

    interface Presenter:IPresenter<View>{
        /**
         * 获取分类的信息
         */
        fun getCategoryData()
    }
}
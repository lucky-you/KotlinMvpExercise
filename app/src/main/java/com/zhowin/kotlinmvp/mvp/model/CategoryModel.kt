package com.zhowin.kotlinmvp.mvp.model

import com.zhowin.kotlinmvp.mvp.model.bean.CategoryBean
import com.zhowin.kotlinmvp.net.RetrofitManager
import com.zhowin.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by xuhao on 2017/11/29.
 * desc: 分类数据模型
 */
class CategoryModel {


    /**
     * 获取分类信息
     */
    fun getCategoryData(): Observable<ArrayList<CategoryBean>> {
        return RetrofitManager.service.getCategory()
                .compose(SchedulerUtils.ioToMain())
    }
}
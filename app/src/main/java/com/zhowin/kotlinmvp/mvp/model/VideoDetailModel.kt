package com.zhowin.kotlinmvp.mvp.model

import com.zhowin.kotlinmvp.mvp.model.bean.HomeBean
import com.zhowin.kotlinmvp.net.RetrofitManager
import com.zhowin.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by xuhao on 2017/11/25.
 * desc:
 */
class VideoDetailModel {

    fun requestRelatedData(id:Long):Observable<HomeBean.Issue>{

        return RetrofitManager.service.getRelatedData(id)
                .compose(SchedulerUtils.ioToMain())
    }

}
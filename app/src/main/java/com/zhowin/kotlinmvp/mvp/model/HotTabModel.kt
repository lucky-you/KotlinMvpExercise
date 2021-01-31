package com.zhowin.kotlinmvp.mvp.model

import com.zhowin.kotlinmvp.mvp.model.bean.TabInfoBean
import com.zhowin.kotlinmvp.net.RetrofitManager
import com.zhowin.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by xuhao on 2017/11/30.
 * desc: 热门 Model
 */
class HotTabModel {

    /**
     * 获取 TabInfo
     */
    fun getTabInfo(): Observable<TabInfoBean> {

        return RetrofitManager.service.getRankList()
                .compose(SchedulerUtils.ioToMain())
    }

}

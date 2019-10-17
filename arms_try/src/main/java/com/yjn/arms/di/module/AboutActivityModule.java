package com.yjn.arms.di.module;

import dagger.Binds;
import dagger.Module;

import com.yjn.arms.mvp.contract.AboutActivityContract;
import com.yjn.arms.mvp.model.AboutActivityModel;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 10/17/2019 14:16
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class AboutActivityModule {

    @Binds
    abstract AboutActivityContract.Model bindAboutActivityModel(AboutActivityModel model);
}
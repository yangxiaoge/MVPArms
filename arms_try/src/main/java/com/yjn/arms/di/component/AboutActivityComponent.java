package com.yjn.arms.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.yjn.arms.di.module.AboutActivityModule;
import com.yjn.arms.mvp.contract.AboutActivityContract;

import com.jess.arms.di.scope.ActivityScope;
import com.yjn.arms.mvp.ui.activity.AboutActivity;


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
@ActivityScope
@Component(modules = AboutActivityModule.class, dependencies = AppComponent.class)
public interface AboutActivityComponent {
    void inject(AboutActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        AboutActivityComponent.Builder view(AboutActivityContract.View view);

        AboutActivityComponent.Builder appComponent(AppComponent appComponent);

        AboutActivityComponent build();
    }
}
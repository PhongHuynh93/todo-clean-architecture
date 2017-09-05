package com.phong.injection.component;

import dagger.Subcomponent;
import com.phong.features.detail.DetailActivity;
import com.phong.features.main.MainActivity;
import com.phong.injection.PerActivity;
import com.phong.injection.module.ActivityModule;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}

package com.phong.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.phong.common.injection.module.ApplicationTestModule;
import com.phong.injection.component.AppComponent;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends AppComponent {
}

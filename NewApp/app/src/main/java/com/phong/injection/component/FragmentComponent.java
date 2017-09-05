package com.phong.injection.component;

import dagger.Subcomponent;
import com.phong.injection.PerFragment;
import com.phong.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}

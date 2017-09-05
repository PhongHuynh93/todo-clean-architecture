package com.phong.features.detail;

import com.phong.data.model.response.Pokemon;
import com.phong.data.model.response.Statistic;
import com.phong.features.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError(Throwable error);
}

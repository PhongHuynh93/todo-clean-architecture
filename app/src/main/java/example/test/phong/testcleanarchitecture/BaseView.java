package example.test.phong.testcleanarchitecture;

/**
 * Created by user on 9/5/2017.
 */

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);

}

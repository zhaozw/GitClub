package tellh.com.gitclub.presentation.contract;

import java.util.List;

import tellh.com.gitclub.common.base.BaseView;
import tellh.com.gitclub.common.base.MvpPresenter;
import tellh.com.gitclub.model.entity.Event;
import tellh.com.gitclub.presentation.view.adapter.FooterLoadMoreAdapterWrapper.UpdateType;

public interface NewsContract {
    interface View extends BaseView,ShowError {
        void OnGetNews(List<Event> newsList, UpdateType updateType);

        void showLoginDialog();
    }

    interface Presenter extends MvpPresenter<View> {
        void listNews(int page);
    }
}
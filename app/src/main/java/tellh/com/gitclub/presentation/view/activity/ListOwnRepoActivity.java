package tellh.com.gitclub.presentation.view.activity;

import android.app.Activity;
import android.content.Intent;

import static tellh.com.gitclub.common.config.ExtraKey.USER_NAME;

/**
 * Created by tlh on 2016/9/16 :)
 */
public class ListOwnRepoActivity extends ListRepoActivity {

    public static void launch(String user, Activity srcActivity) {
        Intent intent = new Intent(srcActivity, ListOwnRepoActivity.class);
        intent.putExtra(USER_NAME, user);
        srcActivity.startActivity(intent);
    }

    @Override
    protected String getToolbarTitle() {
        return "Repositories";
    }

    @Override
    public void onRefresh() {
        presenter.listOwnRepo(1);
    }

    @Override
    public void onToLoadMore(int curPage) {
        super.onToLoadMore(curPage);
        presenter.listOwnRepo(curPage + 1);
    }
}

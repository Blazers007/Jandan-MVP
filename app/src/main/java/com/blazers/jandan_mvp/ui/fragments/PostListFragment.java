package com.blazers.jandan_mvp.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.blazers.jandan_mvp.presenter.PostPresenter;
import com.blazers.jandan_mvp.view.IPostView;

import java.util.List;

/**
 * Created by Blazers on 2016/3/7.
 */
public class PostListFragment extends Fragment {

    /**

    * 伪工厂模式
    * */
    public static Fragment newInstance(Bundle args) {
        PostListFragment fragment = new PostListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    private PostPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mPresenter = new PostPresenter(this);
    }

}

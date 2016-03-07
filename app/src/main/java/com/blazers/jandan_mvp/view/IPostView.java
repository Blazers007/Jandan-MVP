package com.blazers.jandan_mvp.view;

import java.util.List;

/**
 * Created by Blazers on 2016/3/7.
 */
public interface IPostView {

    void startLoadingDataByPage(int page);
    /* 加载的数据成功 */
    void onLoadingDataSuccess(List<T> newData);
    /* 加载失败 */
    void onLoadingDataFailed(String errorMessage);
    /* 选中某一列 */
    void onItemClick(T itemModel);

}

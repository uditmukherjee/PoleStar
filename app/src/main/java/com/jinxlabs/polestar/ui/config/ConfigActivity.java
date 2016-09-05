package com.jinxlabs.polestar.ui.config;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jinxlabs.polestar.R;

public class ConfigActivity extends AppCompatActivity implements IConfigView {

  @BindView(R.id.back_arrow) ImageView backArrow;
  @BindView(R.id.toolbar_title) TextView toolbarTitle;
  @BindView(R.id.save) ImageView save;
  @BindView(R.id.config_name) EditText configName;
  @BindView(R.id.disable_notify) CheckBox disableNotify;
  @BindView(R.id.filter_notify) RadioButton filterNotify;
  @BindView(R.id.filter_all_notify) RadioButton filterAllNotify;
  @BindView(R.id.dismiss_notify) RadioButton dismissNotify;
  @BindView(R.id.mute_notify) RadioButton muteNotify;
  @BindView(R.id.hide_notify) RadioButton hideNotify;
  @BindView(R.id.select_apps) TextView selectApps;
  @BindView(R.id.app_list_recycler) RecyclerView appListRecycler;
  @BindView(R.id.app_list) LinearLayout appList;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.config_add);
    ButterKnife.bind(this);
  }

  @OnClick({
      R.id.back_arrow, R.id.save, R.id.disable_notify, R.id.filter_notify, R.id.filter_all_notify,
      R.id.dismiss_notify, R.id.mute_notify, R.id.hide_notify, R.id.select_apps,
      R.id.app_list_recycler, R.id.app_list
  }) public void onClick(View view) {
    switch (view.getId()) {
      case R.id.back_arrow:
        onBackPressed();
        break;
      case R.id.save:
        break;
      case R.id.disable_notify:
        break;
      case R.id.filter_notify:
        break;
      case R.id.filter_all_notify:
        break;
      case R.id.dismiss_notify:
        break;
      case R.id.mute_notify:
        break;
      case R.id.hide_notify:
        break;
      case R.id.select_apps:
        break;
      case R.id.app_list_recycler:
        break;
      case R.id.app_list:
        break;
    }
  }
}

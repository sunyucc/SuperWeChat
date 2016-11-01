package cn.ucai.superwechat.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.ucai.superwechat.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends BaseActivity {

    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    GuideActivity mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        mContext = this;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login:
                MFGT.gotoLogin(mContext);
                finish();
                break;
            case R.id.tv_register:
                MFGT.gotoRegister(mContext);
                finish();
                break;
        }
    }
}

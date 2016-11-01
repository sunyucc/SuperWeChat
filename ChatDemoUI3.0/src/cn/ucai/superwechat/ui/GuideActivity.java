package cn.ucai.superwechat.ui;

import android.os.Bundle;
import android.view.View;

import cn.ucai.superwechat.R;

import butterknife.ButterKnife;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login:
                MFGT.gotoLogin(this);
                break;
            case R.id.tv_register:
                MFGT.gotoRegister(this);
                break;
        }
    }
}

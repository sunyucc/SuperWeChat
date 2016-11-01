package cn.ucai.superwechat.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.ucai.superwechat.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends Activity {

    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login:
                startActivity(new Intent(GuideActivity.this,LoginActivity.class));
                finish();
                break;
            case R.id.tv_register:
                startActivity(new Intent(GuideActivity.this,RegisterActivity.class));
                finish();
                break;
        }
    }
}

package com.example.wangwei.android_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)this.findViewById(R.id.textview1);
        textView2=(TextView)this.findViewById(R.id.textview2);
        String html="<font clolr='red'>I love android </font><br>";
        html +="<font color='@0000FF'><big><i>I love android</i><>big></font><p>";
        html +="<big><a href='http://www.baidu.com'>百度</a></big>";
        textView1.setText(Html.fromHtml(html));
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        String text ="我的url：http://www.sina.com\n";
        text +="我的Email：abcd@126.com\n";
        text +="我的电话：+86 18662915711\n";
        textView2.setText(text);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

    }
}

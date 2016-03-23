package com.example.ce_1958687;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    View.OnClickListener onClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));


        adapter = new MyAdapter(getBaseContext(), new String[]{
                "http://assets.vogue.com/photos/56d94e1440a5ec107d06d00f/master/pass/_ARC0031.jpg",
                "http://assets.vogue.com/photos/56d6c5070715a2423ac3b4f9/master/pass/KIM_0693.jpg",
                "http://assets.vogue.com/photos/55f82e98dec6259042310556/master/pass/_ROD0101.jpg",
                "http://assets.vogue.com/photos/55f82fa5dec6259042310569/master/pass/_ROD0253.jpg",
                "http://assets.vogue.com/photos/55f830484399ed4a7e86e02e/master/pass/_ROD0365.jpg",
                "http://assets.vogue.com/photos/55f831d0369ee0c34d2215ca/master/pass/_ROD0571.jpg",
                "http://assets.vogue.com/photos/55f83320369ee0c34d2215ee/master/pass/_ROD0697.jpg",
                "http://assets.vogue.com/photos/56d851b3050ae6403a815219/master/pass/_MON0853.jpg",
                "http://assets.vogue.com/photos/56d852820715a2423ac3c3b0/master/pass/_MON0935.jpg",
                "http://assets.vogue.com/photos/56a743fd51a18c910eda8fef/master/pass/_CHA0519.jpg",
                "http://assets.vogue.com/photos/56d852cb40a5ec107d06c45a/master/pass/_MON1029.jpg",
                "http://assets.vogue.com/photos/56a11357754dec1e1e0dcd3f/master/pass/alberta-ferretti-pre-fall-2016-01.jpg",
                "http://assets.vogue.com/photos/56d8535fbe6733b44cb528be/master/pass/_MON1125.jpg",
                "http://assets.vogue.com/photos/56a6642f51a18c910eda8ccb/master/pass/alberta-ferretti-limited-edition-aw-2016-16.jpg",
                "http://assets.vogue.com/photos/56a6643651a18c910eda8ce4/master/pass/alberta-ferretti-limited-edition-aw-2016-22.jpg",
                "http://assets.vogue.com/photos/56d85365d44ad6bd4ce14aa6/master/pass/_MON1173.jpg",
                "http://assets.vogue.com/photos/560fcefa2a2d27656d616010/master/pass/alessandra-rich-spring-rtw-2016-24.jpg",
                "http://assets.vogue.com/photos/56d853b7d44ad6bd4ce14ac0/master/pass/_MON1239.jpg",
                "http://assets.vogue.com/photos/56ca149510c4f4de4077680e/master/pass/KIM_0766.jpg",
                "http://assets.vogue.com/photos/56a6642951a18c910eda8cc1/master/pass/alberta-ferretti-limited-edition-aw-2016-07.jpg",
                "http://assets.vogue.com/photos/56d8530fd44ad6bd4ce14a84/master/pass/_MON1051.jpg",
                "http://assets.vogue.com/photos/5613927b2a2d27656d6182ba/master/pass/_CHA0099.jpg",
                "http://assets.vogue.com/photos/5613938c776d3c686d791a49/master/pass/_CHA0127.jpg",
                "http://assets.vogue.com/photos/561396552a2d27656d6182f2/master/pass/_CHA0263.jpg",
                "http://assets.vogue.com/photos/561394115b39586e6d21c4f1/master/pass/_CHA0131.jpg",
                "http://assets.vogue.com/photos/56139417abb51b0710b21bac/master/pass/_CHA0141.jpg",
                "http://assets.vogue.com/photos/56ca0fe505d0ebda742c5149/master/pass/KIM_0249.jpg",
                "http://assets.vogue.com/photos/56a7462951a18c910eda9042/master/pass/_CHA0967.jpg",
                "http://assets.vogue.com/photos/55f830461220d6bc4daaebe2/master/pass/_ROD0345.jpg",
                "http://assets.vogue.com/photos/55f830a090e1ea5743ee7013/master/pass/_ROD0429.jpg",
                "http://assets.vogue.com/photos/55f82f58369ee0c34d221594/master/pass/_ROD0215.jpg",
                "http://assets.vogue.com/photos/55f82fa4369ee0c34d22159c/master/pass/_ROD0241.jpg",
                "http://assets.vogue.com/photos/55f82f53d23aaab74d154987/master/pass/_ROD0193.jpg",
                "http://assets.vogue.com/photos/5602e53093c4717d5254398f/master/pass/KIM_0016.jpg",
                "http://assets.vogue.com/photos/5602e528dcf6f00e16566453/master/pass/KIM_0033.jpg",
                "http://assets.vogue.com/photos/5602e5328ec1a0f23c81385c/master/pass/KIM_0129.jpg",
                "http://assets.vogue.com/photos/5602e5381422670c16303ed8/master/pass/KIM_0226.jpg",
                "http://assets.vogue.com/photos/5602e55da74fc0fc3994dd1a/master/pass/KIM_0758.jpg",
                "http://assets.vogue.com/photos/5602e57e568cb2f939935bdc/master/pass/KIM_1014.jpg",
                "http://assets.vogue.com/photos/5602e57a9a832f7a52a92b62/master/pass/KIM_1062.jpg",
                "http://assets.vogue.com/photos/5602e5621422670c16303f12/master/pass/KIM_0724.jpg",
                "http://assets.vogue.com/photos/56ca14eca20a782629c3c669/master/pass/KIM_0832.jpg",
                "http://assets.vogue.com/photos/56d6c5345287c6127d544787/master/pass/KIM_0741.jpg",
                "http://assets.vogue.com/photos/56d8504840a5ec107d06c41a/master/pass/_MON0509.jpg",
                "http://assets.vogue.com/photos/56d8509f40a5ec107d06c423/master/pass/_MON0635.jpg",
                "http://assets.vogue.com/photos/55f831d390e1ea5743ee7021/master/pass/_ROD0597.jpg",
                "http://assets.vogue.com/photos/55f82ff37e0985517e1cffd0/master/pass/_ROD0299.jpg",
                " http://assets.vogue.com/photos/56d850df0715a2423ac3c37d/master/pass/_MON0661.jpg",
                "http://assets.vogue.com/photos/56d84dee875147393a586730/master/pass/_MON0015.jpg",
                "http://assets.vogue.com/photos/56d84f4cd44ad6bd4ce14a22/master/pass/_MON0273.jpg",
                "http://assets.vogue.com/photos/55f830972f0cd74d7e5f08ee/master/pass/_ROD0387.jpg",
                "http://assets.vogue.com/photos/56d850039fd7a9bb4cd6fc88/master/pass/_MON0459.jpg",
                "http://assets.vogue.com/photos/56ca0fe09ea19231293b837a/master/pass/KIM_0225.jpg",
                "http://assets.vogue.com/photos/56ca12a305d0ebda742c517d/master/pass/KIM_0523.jpg",
                "http://assets.vogue.com/photos/56ca1402a20a782629c3c652/master/pass/KIM_0637.jpg",
                "http://assets.vogue.com/photos/56decab22659bf3a0e070445/master/pass/_LUC8919.jpg",
                "http://assets.vogue.com/photos/56deaa107314ef1c4ab0f022/master/pass/_CHA0649.jpg",
                "http://assets.vogue.com/photos/56dea958fc6e20370ee618aa/master/pass/_CHA0627.jpg",
                "http://assets.vogue.com/photos/56deab8f30a94e8c59f8638b/master/pass/_CHA0723.jpg",
                "http://assets.vogue.com/photos/56a64025824811850ec75f8e/master/pass/balmain-pre-fall-2016-20.jpg",
                "http://assets.vogue.com/photos/55c651d408298d8be228d42c/master/pass/YVL_0001.jpg",
                "http://assets.vogue.com/photos/56b41ae83635b4c87b049a4b/master/pass/Baum11006.jpg",
                "http://assets.vogue.com/photos/56b41ad8fa1560c7732b60eb/master/pass/Baum11020.jpg",
                "http://assets.vogue.com/photos/55f82dd848eaf89342da45b4/master/pass/_ROD0039.jpg",
                "http://assets.vogue.com/photos/55f82ff44399ed4a7e86e023/master/pass/_ROD0319.jpg"
        });

        recyclerView.setAdapter(adapter);


        TextView textViewState = (TextView) findViewById(R.id.text_state);
        textViewState.setClickable(true);
        textViewState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Text, displaying current state", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        TextView textViewDesigner = (TextView) findViewById(R.id.designer);
        textViewDesigner.setClickable(true);
        textViewDesigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Created by designer", Toast.LENGTH_LONG);
                toast.show();

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


}

package com.example.ce_1958687;

        import android.app.ActionBar;
        import android.content.DialogInterface;
        import android.content.res.Resources;
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

        import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener onClickListener;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

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

        Resources res = getResources();
        String[] models = res.getStringArray(R.array.models_array);

        adapter = new MyAdapter(getBaseContext(), models);

        recyclerView.setAdapter(adapter);


        TextView textViewFashWeek = (TextView) findViewById(R.id.paris_fashion_week_view);
        textViewFashWeek.setClickable(true);
        textViewFashWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Title", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);

            }
        });

        TextView textViewStart = (TextView) findViewById(R.id.start_show);
        textViewStart.setClickable(true);
        textViewStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Start show", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);
            }
        });

        TextView textViewStarData = (TextView) findViewById(R.id.str_data);
        textViewStarData.setClickable(true);
        textViewStarData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Date start", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);
            }
        });

        TextView textViewFin = (TextView) findViewById(R.id.fin_label);
        textViewFin.setClickable(true);
        textViewFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Finish point", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);
            }
        });


        TextView textViewFinDate = (TextView) findViewById(R.id.fin_data);
        textViewFinDate.setClickable(true);
        textViewFinDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Finish date of the show ", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);
            }
        });


        TextView textViewState = (TextView) findViewById(R.id.text_state);
        textViewState.setClickable(true);
        textViewState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Text, displaying current state", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.CENTER, 10, 10);

            }
        });

        TextView textViewDesigner = (TextView) findViewById(R.id.designer);
        textViewDesigner.setClickable(true);
        textViewDesigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Designer's name", Toast.LENGTH_LONG);
                toast.show();

            }
        });


        TextView textViewStockholm = (TextView) findViewById(R.id.stockholm);
        textViewStockholm.setClickable(true);
        textViewStockholm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplication(), "City", Toast.LENGTH_LONG);
                toast.show();
            }
        });


        TextView textViewChannel = (TextView) findViewById(R.id.channel_show);
        textViewChannel.setClickable(true);
        textViewChannel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Created by brend", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        TextView textViewCouture = (TextView) findViewById(R.id.spring_coutre);
        textViewCouture.setClickable(true);
        textViewCouture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Show attribute", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


}

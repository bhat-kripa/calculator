package com.kripa.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,add,mul,div,sub,clear,equal;
    TextView showres;
    public String res;
    Character op = 'q';
    int i;
    float num, numtemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        one =(Button)findViewById(R.id.one);
        two =(Button)findViewById(R.id.two);
        three =(Button)findViewById(R.id.three);
        four =(Button)findViewById(R.id.four);
        five =(Button)findViewById(R.id.five);
        six =(Button)findViewById(R.id.six);
        seven =(Button)findViewById(R.id.seven);
        eight =(Button)findViewById(R.id.eight);
        nine =(Button)findViewById(R.id.nine);
        zero =(Button)findViewById(R.id.zero);

        add =(Button)findViewById(R.id.plus);
        sub =(Button)findViewById(R.id.minus);
        mul =(Button)findViewById(R.id.mul);
        div =(Button)findViewById(R.id.div);
        clear =(Button)findViewById(R.id.clear);
        equal =(Button)findViewById(R.id.equal);

        showres = (TextView)findViewById(R.id.res_id);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(9);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(0);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='+';
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='-';
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='*';
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op='/';
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }

    private void reset(){
        res="";
        op='q';
        num=0;numtemp=0;
        showres.setText("");
    }

    private void insert(int i){
        res=Integer.toString(i);
        num= Integer.valueOf(res);
        showres.setText(res);
    }

    private void perform(){
        res="";
        numtemp=num;
    }

    private void calculate(){
        if(op=='+'){
            num=numtemp+num;
        }
        else if(op=='-'){
            num=numtemp-num;
        }
        else if(op=='*'){
            num=numtemp*num;
        }
        else if(op=='/'){
            num=numtemp/num;
        }
        showres.setText("" +num);

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

        return super.onOptionsItemSelected(item);
    }
}

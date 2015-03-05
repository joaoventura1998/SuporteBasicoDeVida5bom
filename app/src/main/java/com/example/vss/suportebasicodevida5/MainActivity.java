package com.example.vss.suportebasicodevida5;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    //Método para saltar para outra activity
    public void onCLickChange2Activity(View b) {
        switch (((Button) b).getText().toString()) {
            case "112":
                //Método que pertence à classe super
                //startActivityForResult(new Intent(b.getContext(), RelativeLayout.class), 0);
                break;

            case "SBV":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), sbv_verificar_estado_de_consciencia.class), 0);
                break;

            case "Engasgamento":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), eng_pedir_para_tossir.class), 0);
                break;

            default:
                //Caixa de mensagem do tipo alert
                AlertDialog msgBox = new AlertDialog.Builder(this).create();
                msgBox.setTitle("ATENÇÂO");
                msgBox.setMessage("A activity: " + ((Button) b).getText().toString() + " Não existe");
                msgBox.show();
                break;
        }
    }
}

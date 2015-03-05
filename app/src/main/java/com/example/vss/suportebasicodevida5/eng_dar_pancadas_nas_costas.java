package com.example.vss.suportebasicodevida5;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class eng_dar_pancadas_nas_costas extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_dar_pancadas_nas_costas);
    }

    //Método para saltar para outra activity
    public void onCLickChange2Activity(View b) {
        switch (((Button) b).getText().toString()) {
            case "HOME":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), FragmentPrincipal.class), 0);
                break;

            case "112":
                //Método que pertence à classe super
                //startActivityForResult(new Intent(b.getContext(), RelativeLayout.class), 0);
                break;

            case "Resolveu":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), FragmentPrincipal.class), 0);
                break;

            case "Não Resolveu":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), eng_manobra_de_heimlich.class), 0);
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

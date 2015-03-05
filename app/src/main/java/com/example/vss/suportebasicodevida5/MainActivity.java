package com.example.vss.suportebasicodevida5;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;


/**
 * Created by Utilizador on 05-03-2015.
 */
public class MainActivity extends FragmentActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.fragment);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fragmentManager));

        viewPager.setCurrentItem(1);
    }
    //Método para saltar para outra activity
    public void onCLickChange2Activity(View b) {
        switch (((Button) b).getText().toString()) {
            case "HOME":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), MainActivity.class), 0);
                break;

            case "112":
                //Método que pertence à classe super
                //startActivityForResult(new Intent(b.getContext(), RelativeLayout.class), 0);
                break;

            case "Consciente":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), sbv_pls.class), 0);
                break;

            case "Não Consciente":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), sbv_abertura_da_via_aerea.class), 0);
                break;

            case "Resolveu":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), MainActivity.class), 0);
                break;

            case "Não Resolveu":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), eng_dar_pancadas_nas_costas.class), 0);
                break;

            case "SBV":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(),FragmentSbvVerificarEstadoDeCosciencia1.class), 0);
                break;

            case "Engasgamento":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), FragmentEngPedirParaTossir1.class), 0);
                break;

            default:
                //Caixa de mensagem do tipo alert
                AlertDialog msgBox = new AlertDialog.Builder(b.getContext()).create();
                msgBox.setTitle("ATENÇÂO");
                msgBox.setMessage("A activity: " + ((Button) b).getText().toString() + " Não existe");
                msgBox.show();
                break;
        }
    }





}


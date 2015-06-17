package com.productos.detalle.roxana.detalleproductos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by roxana on 17/06/15.
 */
public class ActivityPrincipal extends FragmentActivity implements Fragment_Lista.Callbacks {

    private boolean dosFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal_listado);

        if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
            dosFragmentos = true;
        }
    }

    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            Fragment_Detalle fragment = new Fragment_Detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, Activity_Detalle.class);
            detailIntent.putExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            startActivity(detailIntent);
        }
    }
}

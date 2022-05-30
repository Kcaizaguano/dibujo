package com.teamproject.doodlz;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class CleanerDialog
{
    public void showDialog(final MainActivity activity)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        builder.setMessage("¿Esta seguro que decea eliminar su imagen?").setTitle("Limpieza de pantalla");
        builder.setPositiveButton("Borrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.clearDrawing();
            }
        });
        builder.setNegativeButton("Seguir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                return;
            }
        });

        builder.show();
    }
}

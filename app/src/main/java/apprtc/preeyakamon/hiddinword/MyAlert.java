package apprtc.preeyakamon.hiddinword;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/**
 * Created by masterUNG on 1/6/2017 AD.
 */

public class MyAlert {

    //Explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }   // Constructor

    public void myDialog(int intIcon, String strTitle,
                         String strMessage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(intIcon);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {



                dialogInterface.dismiss();
            }
        });
        builder.show();


    }   // myDialot

    public void myDialogmaster(int intIcon, String strTitle,
                         String strMessage,
                         final Class<?> myClass, final int index) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(intIcon);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent intent = new Intent(context, myClass);
                intent.putExtra("Index", index);
                context.startActivity(intent);

                dialogInterface.dismiss();
            }
        });
        builder.show();


    }   // myDialot

}   // Main Class

package com.example.arsalan.randomfacts;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class quitdialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.facts_pick)
                .setItems(R.array.actions, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent;
                        switch(which){
                            case 0:
                                intent = new Intent(getActivity(), CrazyFactsActivity.class);
                                startActivity(intent);
                                break;
                            case 1:
                                intent = new Intent(getActivity(), SportsFactsActivity.class);
                                startActivity(intent);
                                break;
                            case 2:
                                Uri mapsearch = Uri.parse("geo:0,0?q=1455+De+Maisonneuve+Blvd.+W.,+Montreal,+Quebec");
                                intent = new Intent(Intent.ACTION_VIEW, mapsearch);
                                startActivity(intent);
                                break;
                            default:
                                break;
                        }
                    }
                });
        return builder.create();
    }
}

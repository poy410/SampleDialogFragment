package com.example.tacademy.sampledialogfragment;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;
/**
 * Created by Tacademy on 2016-04-26.
 */
public class MyMessageDialogFragment extends DialogFragment {
    String message;
    public static MyMessageDialogFragment newInstance(String message) {
        MyMessageDialogFragment f = new MyMessageDialogFragment();
        Bundle b = new Bundle();
        b.putString("message", message);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            message = getArguments().getString("message");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setTitle("alert");
        builder.setMessage("message : " + message);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "Yes Click", Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}

package ru.mirea.sevostyanovvr.dialog;

import android.view.View;

import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

public class MyProgressDialogFragment extends DialogFragment {

    public void showSnackbar(View view) {
        Snackbar sb = Snackbar.make(view, "Hello, World!", Snackbar.LENGTH_LONG);
        sb.show();
    }
}

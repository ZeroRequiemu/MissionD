package com.example.missiond;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/**
 * Ask driver to confirm the money that will be paid on that trip
 * @author
 *  Weiting Chi
 * @version
 *  Mar.12 2020
 */
public class DriverAfterRiderConfrimFragment extends DialogFragment {
    private Button tesing_button;//just for testing

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.after_rider_confirm_fragment, container, false);

        tesing_button = v.findViewById(R.id.just_for_testing);

        tesing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
                Intent intent = new Intent(getActivity(), DriverPickeupRiderActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
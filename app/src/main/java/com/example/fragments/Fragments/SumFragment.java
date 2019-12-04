package com.example.fragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener
{
private Button btncalculate;
private EditText etfirst, etsecond;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btncalculate= view.findViewById(R.id.btncalculate);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first = Integer.parseInt(etfirst.getText().toString());
        int second = Integer.parseInt(etsecond.getText().toString());
        int result = first+second;
        Toast.makeText(getActivity(), "sum is:"+result, Toast.LENGTH_SHORT).show();
    }
}
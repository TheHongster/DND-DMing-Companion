package com.example.dndapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false);
    }


    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final Block cur = mListener.get(mListener.id());

        TextView name = getActivity().findViewById(R.id.Name3);
        TextView ac = getActivity().findViewById(R.id.Ac3);
        TextView hp = getActivity().findViewById(R.id.hp3);
        ProgressBar bar = getActivity().findViewById(R.id.progressBar2);

        final TextView edit = getActivity().findViewById(R.id.editTextNumber3);

        name.setText(cur.Name);
        ac.setText("" + cur.Ac);
        hp.setText(cur.Hp + "/" + cur.HpMax);
        bar.setMax(cur.HpMax);
        bar.setProgress(cur.Hp);

        getActivity().findViewById(R.id.can3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "rcheck");
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.b, new Fragment1())
                        .commitNow();

            }
        });

        getActivity().findViewById(R.id.sub3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!("" + edit.getText()).equals("")) {
                    Log.d("demo", "rcheck");

                    int damage = Integer.parseInt("" + edit.getText());
                    cur.Hp = cur.Hp - damage;
                    if (cur.Hp < 0) {
                        cur.Hp = 0;
                    }

                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.b, new Fragment1())
                            .commitNow();

                }
            }
        });
        getActivity().findViewById(R.id.del).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.delete();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.b, new Fragment1())
                        .commitNow();
            }
        });
    }

        public void onAttach(@NonNull Context context){
        super.onAttach(context);
        if(context instanceof Fragment1.Ilisner) {
            mListener = (Fragment1.Ilisner) context;
        } else {
            throw  new RuntimeException(context.toString()+"must be ilisner");
        }

    }

    Fragment1.Ilisner mListener;

    public interface Ilisner{
        void add(Block block);
        Block get(int i);
        ArrayList grab();
        int id();
        void setId(int i);
    }
}
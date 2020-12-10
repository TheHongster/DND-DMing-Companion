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
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
//don't touch this till line 69
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public int chck;
    public int type =-1;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    //don't touch this till line 69

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final EditText name2 = getActivity().findViewById(R.id.editTextTextPersonName);
        final EditText hp2 = getActivity().findViewById(R.id.editTextNumber);
        final EditText ac2 = getActivity().findViewById(R.id.editTextNumber2);
        final RadioGroup ty2 = getActivity().findViewById(R.id.TypeGroup);
        final EditText amount = getActivity().findViewById(R.id.editTextNumber4);

        ty2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("demo", "1check");
                if (checkedId == R.id.TypeB1){
                    type=1;
                    Log.d("demo", "onCheckedChanged: 1");
                }
                else if (checkedId == R.id.TypeB2){
                    type =2;
                    Log.d("demo", "onCheckedChanged: 2");
                }
                else if (checkedId == R.id.TypeB3){
                    type=3;
                }
                else {
                    Log.d("demo", "nerror");
                    chck++;
                    //Toast.makeText()
                }
            }
        });
        getActivity().findViewById(R.id.can2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "rcheck");
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.b, new Fragment1())
                        .commitNow();

            }
        });
        getActivity().findViewById(R.id.sub2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "rcheck");


                String na = "" + name2.getText();
                int hp =0;
                String hpTemp = ("" + hp2.getText());
                int ac=0;
                String acTemp = ("" + ac2.getText());

                chck = 0;

                Log.d("demo", "type"+type);



                if (na.equals("")) {
                    Log.d("demo", "nerror");

                    chck++;
                    //Toast.makeText()
                }
                if (hpTemp.equals("")) {
                    Log.d("demo", "nerror");
                    chck++;
                    //Toast.makeText()
                } else {
                    hp = Integer.parseInt(hpTemp);
                }
                if (acTemp.equals("")) {
                    Log.d("demo", "nerror");
                    chck++;
                    //Toast.makeText()
                } else {
                    ac = Integer.parseInt(acTemp);
                }
                int runner=0;
                if ((""+amount.getText()).equals("")) {
                    runner=1;
                }
                else {
                    runner=Integer.parseInt(""+amount.getText());
                }
                if(runner<=0){
                    Log.d("demo", "nerror");
                    chck++;
                    //Toast.makeText()
                }


                if (chck == 0) {



                    if (runner>1){
                        for(int i = 1; i<= runner;i++){
                            Block asd = new Block((na+" "+i), hp, ac, type);
                            mListener.add(asd);
                        }

                    }
                    else {
                        Block asd = new Block(na, hp, ac, type);
                        mListener.add(asd);
                    }


                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.b, new Fragment1())
                            .commitNow();

                }
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
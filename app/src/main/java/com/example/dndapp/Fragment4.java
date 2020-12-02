package com.example.dndapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
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
        return inflater.inflate(R.layout.fragment_4, container, false);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {//TODO: SORT METHODS (main)
        super.onActivityCreated(savedInstanceState);

        ArrayList<Block> cur = mListener.grab();

        for(int i = 0; i < cur.size(); i++){
            for(int j = i; j < cur.size(); j++){
                /**if() {//add boolean compareto method in condition
                    Block temp = cur.get(i);
                    cur.get(i) = cur.get(j);
                    cur.get(j) = temp;
                }**/
            }
        }
    }

    public void onAttach(@NonNull Context context){//references Fragment1
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
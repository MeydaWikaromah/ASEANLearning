package com.example.aseanlearning;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuizFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizFragment extends Fragment {

    CardView cv1,cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuizFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuizFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuizFragment newInstance(String param1, String param2) {
        QuizFragment fragment = new QuizFragment();
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
        return inflater.inflate(R.layout.fragment_quiz, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
//        cv1
        cv1 = (CardView) view.findViewById(R.id.cv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda1.class);
                startActivity(intent);

            }
        });

        //        cv2
        cv2 = (CardView) view.findViewById(R.id.cv2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda2.class);
                startActivity(intent);

            }
        });

        //        cv3
        cv3 = (CardView) view.findViewById(R.id.cv3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda3.class);
                startActivity(intent);

            }
        });

        //        cv4
        cv4 = (CardView) view.findViewById(R.id.cv4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda7.class);
                startActivity(intent);

            }
        });

        //        cv5
        cv5 = (CardView) view.findViewById(R.id.cv5);
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda8.class);
                startActivity(intent);

            }
        });

        //        cv6
        cv6 = (CardView) view.findViewById(R.id.cv6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda4.class);
                startActivity(intent);

            }
        });

        //        cv7
        cv7 = (CardView) view.findViewById(R.id.cv7);
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda10.class);
                startActivity(intent);

            }
        });

        //        cv8
        cv8 = (CardView) view.findViewById(R.id.cv8);
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda5.class);
                startActivity(intent);

            }
        });

        //        cv9
        cv9 = (CardView) view.findViewById(R.id.cv9);
        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda6.class);
                startActivity(intent);

            }
        });

        //        cv10
        cv10 = (CardView) view.findViewById(R.id.cv10);
        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),KuisPilihanGanda9.class);
                startActivity(intent);

            }
        });
    }
}
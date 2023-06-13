package com.example.aseanlearning;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    TextView name;
    ImageButton materi1, materi2, materi3, materi4, materi5, materi6, materi7, materi8, materi9, materi10;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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

        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        final View view = inflater.inflate(R.layout.fragment_home, container, false);
        name = (TextView) view.findViewById(R.id.namaa);
        name.setText("Selamat Datang, "+firebaseUser.getDisplayName());

        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
//        materi1
        materi1 = (ImageButton) view.findViewById(R.id.indo);
        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),IndoActivity.class);
                startActivity(intent);

            }
        });

//        materi2
        materi2 = (ImageButton) view.findViewById(R.id.malays);
        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(),MalayActivity.class);
                startActivity(intent2);

            }
        });
        //        materi3
        materi3 = (ImageButton) view.findViewById(R.id.singapuras);
        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity(),SingapuraActivity.class);
                startActivity(intent3);

            }
        });

        //        materi4
        materi4 = (ImageButton) view.findViewById(R.id.thai);
        materi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity(),ThaiActivity.class);
                startActivity(intent4);

            }
        });

        //        materi5
        materi5 = (ImageButton) view.findViewById(R.id.kamboja);
        materi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getActivity(),KambojaActivity.class);
                startActivity(intent5);

            }
        });

        //        materi6
        materi6 = (ImageButton) view.findViewById(R.id.brunei);
        materi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getActivity(),BruneiActivity.class);
                startActivity(intent6);

            }
        });

        //        materi7
        materi7 = (ImageButton) view.findViewById(R.id.filip);
        materi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getActivity(),filiphinaActivity.class);
                startActivity(intent7);

            }
        });

        //        materi8
        materi8 = (ImageButton) view.findViewById(R.id.viet);
        materi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(getActivity(),VietnamActivity.class);
                startActivity(intent8);

            }
        });

        //        materi9
        materi9 = (ImageButton) view.findViewById(R.id.laos);
        materi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(getActivity(),LaosActivity.class);
                startActivity(intent9);

            }
        });

        //        materi10
        materi10 = (ImageButton) view.findViewById(R.id.myan);
        materi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(getActivity(),MyanmarActivity.class);
                startActivity(intent10);

            }
        });
    }
}


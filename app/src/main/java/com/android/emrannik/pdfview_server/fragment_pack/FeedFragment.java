package com.android.emrannik.pdfview_server.fragment_pack;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.android.emrannik.pdfview_server.ItemClickListener;
import com.android.emrannik.pdfview_server.PDFActivity;
import com.android.emrannik.pdfview_server.PDFAdapter;
import com.android.emrannik.pdfview_server.PDFModel;
import com.android.emrannik.pdfview_server.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class FeedFragment extends Fragment {

    private View view;
    RecyclerView recyclerView;
    public static List<PDFModel> list;
    ViewPager viewPager;
    PDFAdapter adapter;
    TabLayout tabLayout;
    Toolbar toolbar;


    private FragmentActivity myContext;
    private static final String TAG = FeedFragment.class.getSimpleName();

    public FeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feed, container, false);
        //viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_id);

        list = new ArrayList<>();
        list.add(new PDFModel("PDF One", "https://drive.google.com/uc?id=1snza0ppKriGSRm4gH_EvX6SKq2U_Z5jI&export=download", R.drawable.abu_hanifa_bk1));
        list.add(new PDFModel("PDF Two", "https://drive.google.com/uc?id=1SwuQWBWXqDlBa94I2I6A6MaGxkAAViDr&export=download", R.drawable.akul_bk1));
        list.add(new PDFModel("PDF Three", "https://drive.google.com/uc?id=1Yqyt9r_tLFlZihIGkwdDvCIXJZQ2JeVa&export=download", R.drawable.alahi_bk));
        list.add(new PDFModel("PDF Four", "https://drive.google.com/uc?id=1EqyAGqYe9MOT-D3e0RZeBxMeyH2HaYwr&export=download", R.drawable.albani_bk1));
        list.add(new PDFModel("PDF Five", "https://drive.google.com/uc?id=1hu6EwydDwYkD09SqlRtTOIy_Bo3qFcwG&export=download", R.drawable.aziz_lotif_bk1));
        list.add(new PDFModel("PDF Six", "https://drive.google.com/uc?id=1OfwpNuvP1XO3klbS3IfRiVY05ezO46XQ&export=download", R.drawable.bazz_bk1));
        list.add(new PDFModel("PDF Seven", "https://drive.google.com/uc?id=1OfwpNuvP1XO3klbS3IfRiVY05ezO46XQ&export=download", R.drawable.bazz_bk2));
        list.add(new PDFModel("PDF Eight", "https://drive.google.com/uc?id=1q9tZ8J64ysGM4rEib1NzxsZ1JrgR1rtg&export=download", R.drawable.bazz_bk3));
        list.add(new PDFModel("PDF Nine", "https://drive.google.com/uc?id=1QKO8ZVgK2R58O2jkcDrr0i-kmhs1S-tU&export=download", R.drawable.faozan_bk1));
        list.add(new PDFModel("PDF Ten", "https://drive.google.com/uc?id=1na7PTUfj0hgBn_pBTLlIENGu-4UkG82p&export=download", R.drawable.filips));
        list.add(new PDFModel("PDF Eleven", "https://drive.google.com/uc?id=1Cz87YcwmmjXrrn6Hc01WhurhXTurlTB5&export=download", R.drawable.four_imam));
        list.add(new PDFModel("PDF Twelve", "https://drive.google.com/uc?id=1u2lh4ChsE080zMpyg_hZgS3oM3lh3exp&export=download", R.drawable.hazemi_bk1));

        list.add(new PDFModel("PDF 13", "https://drive.google.com/uc?id=1snza0ppKriGSRm4gH_EvX6SKq2U_Z5jI&export=download", R.drawable.husain_bk1));
        list.add(new PDFModel("PDF 14", "https://drive.google.com/uc?id=1SwuQWBWXqDlBa94I2I6A6MaGxkAAViDr&export=download", R.drawable.jahagir_bk1));
        list.add(new PDFModel("PDF 15", "https://drive.google.com/uc?id=1Yqyt9r_tLFlZihIGkwdDvCIXJZQ2JeVa&export=download", R.drawable.jainu_bk1));
        list.add(new PDFModel("PDF 16", "https://drive.google.com/uc?id=1EqyAGqYe9MOT-D3e0RZeBxMeyH2HaYwr&export=download", R.drawable.kader_bk1));
        list.add(new PDFModel("PDF 17", "https://drive.google.com/uc?id=1hu6EwydDwYkD09SqlRtTOIy_Bo3qFcwG&export=download", R.drawable.kazi_bk1));
        list.add(new PDFModel("PDF 18", "https://drive.google.com/uc?id=1OfwpNuvP1XO3klbS3IfRiVY05ezO46XQ&export=download", R.drawable.ohab_bk1));
        list.add(new PDFModel("PDF 19", "https://drive.google.com/uc?id=1OfwpNuvP1XO3klbS3IfRiVY05ezO46XQ&export=download", R.drawable.ohab_bk2));
        list.add(new PDFModel("PDF 20", "https://drive.google.com/uc?id=1q9tZ8J64ysGM4rEib1NzxsZ1JrgR1rtg&export=download", R.drawable.sana_bk1));
        list.add(new PDFModel("PDF 21", "https://drive.google.com/uc?id=1QKO8ZVgK2R58O2jkcDrr0i-kmhs1S-tU&export=download", R.drawable.siyadek_akida));
        list.add(new PDFModel("PDF 22", "https://drive.google.com/uc?id=1na7PTUfj0hgBn_pBTLlIENGu-4UkG82p&export=download", R.drawable.tahai_bk1));
        list.add(new PDFModel("PDF 23", "https://drive.google.com/uc?id=1Cz87YcwmmjXrrn6Hc01WhurhXTurlTB5&export=download", R.drawable.tahamia_bk1));
        list.add(new PDFModel("PDF 24", "https://drive.google.com/uc?id=1u2lh4ChsE080zMpyg_hZgS3oM3lh3exp&export=download", R.drawable.team_bk));
        list.add(new PDFModel("PDF 25", "https://drive.google.com/uc?id=1QKO8ZVgK2R58O2jkcDrr0i-kmhs1S-tU&export=download", R.drawable.tohabia_bk1));
        list.add(new PDFModel("PDF 26", "https://drive.google.com/uc?id=1na7PTUfj0hgBn_pBTLlIENGu-4UkG82p&export=download", R.drawable.ulaini_bk));
        list.add(new PDFModel("PDF 27", "https://drive.google.com/uc?id=1Cz87YcwmmjXrrn6Hc01WhurhXTurlTB5&export=download", R.drawable.usaimi_bk1));
        //list.add(new PDFModel("PDF 28", "https://drive.google.com/uc?id=1u2lh4ChsE080zMpyg_hZgS3oM3lh3exp&export=download", R.drawable.usaimi_bk2));




        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));

        ItemClickListener itemClickListener = new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent intent = new Intent(getActivity(), PDFActivity.class);
                //intent.putExtra("url",list.get(position).getPdfUrl());
                intent.putExtra("position", position);
                startActivity(intent);
            }
        };

        PDFAdapter adapter = new PDFAdapter(list, view.getContext(), itemClickListener);
        recyclerView.setAdapter(adapter);
        return view;
    }

    //menu add code//

}

package com.android.emrannik.pdfview_server;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PDFAdapter extends RecyclerView.Adapter<PDFAdapter.Holder> {

    private List<PDFModel> list;
    private Context context;
    ItemClickListener itemClickListener;
    int numOfTabs;

    public PDFAdapter(List<PDFModel> list, Context context, ItemClickListener itemClickListener) {
        this.list = list;
        this.context = context;
        this.itemClickListener = itemClickListener;
    }

    public PDFAdapter(FragmentManager supportFragmentManager) {
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.pdf_item,parent,false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.pdfName.setText(list.get(position).getPdfName());
        holder.imageView.setImageResource(list.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView pdfName;
        private ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            pdfName = itemView.findViewById(R.id.book_title_id);
            imageView = itemView.findViewById(R.id.book_img_id);

            imageView.setOnClickListener(this);
        }

        
        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
        }
    }
}

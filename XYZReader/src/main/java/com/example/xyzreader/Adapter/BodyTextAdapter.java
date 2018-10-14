package com.example.xyzreader.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.List;

public class BodyTextAdapter extends RecyclerView.Adapter<BodyTextAdapter.TextViewHolder> {
    Context mContext;
    List<String> mTextList;

    public BodyTextAdapter(Context context, List<String> text){
        mContext = context;
        mTextList = text;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.text_list_item, viewGroup, false);
        return new TextViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder textViewHolder, int i) {
        String bodyText = mTextList.get(i);
        textViewHolder.mTextView.setText(bodyText);
        textViewHolder.mTextView.setTypeface(Typeface.createFromAsset(mContext.getResources().getAssets(), "Rosario-Regular.ttf"));
    }

    @Override
    public int getItemCount() {
        return mTextList.size();
    }

    public class TextViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.body_text);
        }
    }
}

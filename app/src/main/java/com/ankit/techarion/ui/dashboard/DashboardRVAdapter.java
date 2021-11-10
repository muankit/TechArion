package com.ankit.techarion.ui.dashboard;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.ankit.techarion.R;
import com.ankit.techarion.models.SearchModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class DashboardRVAdapter extends RecyclerView.Adapter<DashboardRVAdapter.SearchViewHolder> {

    private List<SearchModel> items;

    public DashboardRVAdapter(List<SearchModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_item_layout, parent, false);
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.onBind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class SearchViewHolder extends RecyclerView.ViewHolder {

        private ImageFilterView mUserImg;
        private MaterialTextView mUsername, mMainText;
        private ImageView likeImg1, likeImg2, likeImg3;
        private TextView mCommentCount, mLikeCount;

        private ConstraintLayout baseContainer;

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            mUsername = itemView.findViewById(R.id.discover_user_name);
            mUserImg = itemView.findViewById(R.id.discover_usr_img);
            mMainText = itemView.findViewById(R.id.discover_text);
            likeImg1 = itemView.findViewById(R.id.discover_like_img1);
            likeImg2 = itemView.findViewById(R.id.discover_like_img2);
            likeImg3 = itemView.findViewById(R.id.discover_like_img3);
            mCommentCount = itemView.findViewById(R.id.discover_comment_txt);
            mLikeCount = itemView.findViewById(R.id.discover_like_count);
            baseContainer = itemView.findViewById(R.id.discover_root_container);

        }

        public void onBind(SearchModel model) {
            mUsername.setText(model.getUserName());
            mCommentCount.setText(model.getCommentCount());
            mLikeCount.setText(model.getLikeCount());
            mMainText.setText(model.getMainText());

            Glide.with(itemView.getContext()).load(model.getUsrImg()).into(mUserImg);
            Glide.with(itemView.getContext()).load(model.getLikeImg1()).apply(RequestOptions.circleCropTransform()).into(likeImg1);
            Glide.with(itemView.getContext()).load(model.getLikeImg2()).apply(RequestOptions.circleCropTransform()).into(likeImg2);
            Glide.with(itemView.getContext()).load(model.getLikeImg3()).apply(RequestOptions.circleCropTransform()).into(likeImg3);


            if (model.getCardColor().equals("green")) {
                baseContainer.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.rounded_corner_green));
            } else if(model.getCardColor().equals("violet")) {
                baseContainer.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.rounded_corner_violet));
            } else if (model.getCardColor().equals("red")){
                baseContainer.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.rounded_corner_red));
            }

        }
    }
}

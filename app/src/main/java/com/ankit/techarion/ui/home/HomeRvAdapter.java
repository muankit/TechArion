package com.ankit.techarion.ui.home;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
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
import com.ankit.techarion.models.HomeModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class HomeRvAdapter extends RecyclerView.Adapter<HomeRvAdapter.HomeViewHolder> {

    private List<HomeModel> items;

    public HomeRvAdapter(List<HomeModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item_layout, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.onBind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {

        private ImageView mUserImg;
        private ImageView mUserImg2;
        private MaterialTextView mUsername, mUsername2, mMainText;
        private ImageView likeImg1, likeImg2, likeImg3;
        private TextView description, mLikeCount;

        private ConstraintLayout insideContainer;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);

            mUsername = itemView.findViewById(R.id.home_user_name);
            mUsername2 = itemView.findViewById(R.id.home_user_name_2);
            mUserImg = itemView.findViewById(R.id.home_usr_img);
            mUserImg2 = itemView.findViewById(R.id.home_usr_img_2);
            mMainText = itemView.findViewById(R.id.home_main_text);
            likeImg1 = itemView.findViewById(R.id.home_like_img1);
            likeImg2 = itemView.findViewById(R.id.home_like_img2);
            likeImg3 = itemView.findViewById(R.id.home_like_img3);
            description = itemView.findViewById(R.id.home_description);
            mLikeCount = itemView.findViewById(R.id.home_like_count);
            insideContainer = itemView.findViewById(R.id.home_inside_container);
        }

        public void onBind(HomeModel homeModel) {
            mUsername.setText(homeModel.getUsername1());
            mUsername2.setText(homeModel.getUsername2());

            mMainText.setText(homeModel.getMainText());


            SpannableStringBuilder sb = new SpannableStringBuilder(homeModel.getDescription());
            final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);
            sb.setSpan(bss, homeModel.getDescription().length() - 7, homeModel.getDescription().length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            description.setText(sb);

            mLikeCount.setText(homeModel.getLikeCount());

            if (homeModel.getCardColor().equals("green")) {
                insideContainer.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.rounded_corner_green));
            } else if(homeModel.getCardColor().equals("red")) {
                insideContainer.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.rounded_corner_red));
            }

            Glide.with(itemView.getContext()).load(homeModel.getUserImg1()).apply(RequestOptions.circleCropTransform()).into(mUserImg);
            Glide.with(itemView.getContext()).load(homeModel.getUsrImg2()).apply(RequestOptions.circleCropTransform()).into(mUserImg2);
            Glide.with(itemView.getContext()).load(homeModel.getLikeImg1()).apply(RequestOptions.circleCropTransform()).into(likeImg1);
            Glide.with(itemView.getContext()).load(homeModel.getLikeImg2()).apply(RequestOptions.circleCropTransform()).into(likeImg2);
            Glide.with(itemView.getContext()).load(homeModel.getLikeImg3()).apply(RequestOptions.circleCropTransform()).into(likeImg3);
        }
    }
}

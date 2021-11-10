package com.ankit.techarion.ui.notifications;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.recyclerview.widget.RecyclerView;

import com.ankit.techarion.R;
import com.ankit.techarion.models.NotificationModel;
import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class NotificationRVAdapter extends RecyclerView.Adapter<NotificationRVAdapter.NotificationViewHolder> {

    private List<NotificationModel> items;

    public NotificationRVAdapter(List<NotificationModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item_layout, parent, false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        holder.onBind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder {

        private ImageFilterView notificationImg;
        private MaterialTextView notificationTxt;

        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);

            notificationImg = itemView.findViewById(R.id.notification_item_img);
            notificationTxt = itemView.findViewById(R.id.notification_item_txt);
        }

        public void onBind(NotificationModel notificationModel) {

            SpannableStringBuilder sb = new SpannableStringBuilder(notificationModel.getNotificationText());
            final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);
            sb.setSpan(bss, 0, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            notificationTxt.setText(sb);

//            notificationTxt.setText(notificationModel.getNotificationText());
            Glide.with(itemView.getContext()).load(notificationModel.getUserImg()).into(notificationImg);
        }
    }
}

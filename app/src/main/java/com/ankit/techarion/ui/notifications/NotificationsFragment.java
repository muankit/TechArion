package com.ankit.techarion.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ankit.techarion.R;
import com.ankit.techarion.models.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private List<NotificationModel> itemList = new ArrayList<>();

    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel = new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);;

        init(root);

        createDataSet();

        NotificationRVAdapter adapter = new NotificationRVAdapter(itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);



        return root;
    }

    private void init(View root) {
        recyclerView = root.findViewById(R.id.notification_rv);
    }

    private void createDataSet() {
        itemList.clear();

        NotificationModel model1 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model2 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model3 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model4 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model5 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model6 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model7 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model8 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model9 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model10 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model11 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model12 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model13 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model14 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model15 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model16 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model17 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model18 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model19 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");
        NotificationModel model20 = new NotificationModel("Sameer_y and 8 others liked your Twinkle Twinkle Content", "https://i.imgur.com/QtASQ3U.jpg");

        itemList.add(model1);
        itemList.add(model2);
        itemList.add(model3);
        itemList.add(model4);
        itemList.add(model5);
        itemList.add(model6);
        itemList.add(model7);
        itemList.add(model8);
        itemList.add(model9);
        itemList.add(model10);
        itemList.add(model11);
        itemList.add(model12);
        itemList.add(model13);
        itemList.add(model14);
        itemList.add(model15);
        itemList.add(model16);
        itemList.add(model17);
        itemList.add(model18);
        itemList.add(model19);
        itemList.add(model20);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
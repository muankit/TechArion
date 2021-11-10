package com.ankit.techarion.ui.home;

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
import com.ankit.techarion.models.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private RecyclerView recyclerView;
    private List<HomeModel> items = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        init(root);

        createDataSet();

        HomeRvAdapter adapter = new HomeRvAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return root;
    }

    private void createDataSet() {
        items.clear();
        HomeModel model1 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model2 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model3 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model4 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model5 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model6 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model7 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model8 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model9 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model10 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model11 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model12 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model13 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model14 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model15 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "red", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");
        HomeModel model16 =  new HomeModel("Rupi kaur", "rupi kaur", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", getContext().getResources().getString(R.string.dummy_text4), "5 Likes", getContext().getResources().getString(R.string.description) , "green", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg");

        items.add(model1);
        items.add(model2);
        items.add(model3);
        items.add(model4);
        items.add(model5);
        items.add(model6);
        items.add(model7);
        items.add(model8);
        items.add(model9);
        items.add(model10);
        items.add(model11);
        items.add(model12);
        items.add(model13);
        items.add(model14);
        items.add(model15);
        items.add(model16);
    }

    private void init(View root) {
        recyclerView = root.findViewById(R.id.home_rv);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
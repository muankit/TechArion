package com.ankit.techarion.ui.dashboard;

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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.ankit.techarion.R;
import com.ankit.techarion.databinding.FragmentDashboardBinding;
import com.ankit.techarion.models.SearchModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private RecyclerView recyclerView;

    private List<SearchModel> items = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);;

        init(root);

        createDataSet();

        DashboardRVAdapter adapter = new DashboardRVAdapter(items);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        return root;
    }

    private void createDataSet() {

        items.clear();

        SearchModel model1 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "violet");
        SearchModel model2 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text2), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "green");
        SearchModel model3 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text3), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "red");
        SearchModel model4 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "violet");
        SearchModel model5 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "green");
        SearchModel model6 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "red");
        SearchModel model7 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "violet");
        SearchModel model8 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "green");
        SearchModel model9 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "red");
        SearchModel model10 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text2), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "violet");
        SearchModel model11 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text3), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "green");
        SearchModel model12 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "red");
        SearchModel model13 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "violet");
        SearchModel model14 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "green");
        SearchModel model15 = new SearchModel("https://i.imgur.com/P6dckFJ.jpg", "ritu kaur", getContext().getResources().getString(R.string.dummy_text), "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "https://i.imgur.com/P6dckFJ.jpg", "5 Likes", "5 Comments", "red");

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

    }

    private void init(View root) {
        recyclerView = root.findViewById(R.id.search_rv);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
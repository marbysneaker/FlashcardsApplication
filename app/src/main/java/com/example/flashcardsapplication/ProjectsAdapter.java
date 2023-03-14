package com.example.flashcardsapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    private SelectListener selectListener;



    public ProjectsAdapter(Project[] projects, SelectListener selectListener) {
        this.projects = projects;
        this.selectListener = selectListener;

    }
    @Override
    public int getItemCount() {
        return  projects.length;
    }


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cards, parent, false);

        return new ProjectViewHolder(view, selectListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }




    static class ProjectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        RelativeLayout placeHolder;
        SelectListener selectListener;

        public ProjectViewHolder(@NonNull View itemView, SelectListener selectListener) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project);
            appTitle = itemView.findViewById(R.id.text_view_title);
            appDescription = itemView.findViewById(R.id.text_view_description);

            placeHolder = itemView.findViewById(R.id.place_holder);

            this.selectListener = selectListener;

            itemView.setOnClickListener(this);
        }

        public void bind(Project project){
            appTitle.setText(project.projectName);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
            placeHolder.setId(project.id);

        }


        @Override
        public void onClick(View view) {
            selectListener.onItemClicked(getAdapterPosition());
        }
    }
}
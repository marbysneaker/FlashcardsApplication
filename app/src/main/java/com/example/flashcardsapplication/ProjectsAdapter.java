package com.example.flashcardsapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }
    @Override
    public int getItemCount() {
        return  projects.length;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cards, parent, false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }



    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        RelativeLayout placeHolder;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project);
            appTitle = itemView.findViewById(R.id.text_view_title);
            appDescription = itemView.findViewById(R.id.text_view_description);
            placeHolder = itemView.findViewById(R.id.place_holder);
        }

        public void bind(Project project){
            appTitle.setText(project.projectName);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
            placeHolder.setId(project.id);
        }
    }
}
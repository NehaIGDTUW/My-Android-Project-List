package com.nehaanand.nehasandroidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewholder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }


    @Override
    public int getItemCount() {
        return projects.length;
    }


    @NonNull
    @Override
    public ProjectViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsAdapter.ProjectViewholder holder, int position) {
        holder.bind(projects[position]);
    }


    static class ProjectViewholder extends RecyclerView.ViewHolder{

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;
        public ProjectViewholder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_title);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        public void bind(Project project ){
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}

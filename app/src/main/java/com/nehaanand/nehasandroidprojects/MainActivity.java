package com.nehaanand.nehasandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);
        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app!", R.drawable.image_getting_started),
                new Project("Motivational Quotes", "Some motivational quotes for IT professionals.", R.drawable.image_quote),
                new Project("BMI Calculator", "An app to know your correct weight status.", R.drawable.images_calculator),
                new Project("Converter", "Conversion of inches to metres.", R.drawable.image_tape),
                new Project("Shree Kitchen", "My mother's restaurant's app.", R.drawable.image_shree_kitchen)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}
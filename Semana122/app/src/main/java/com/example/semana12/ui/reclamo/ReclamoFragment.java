package com.example.semana12.ui.reclamo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.semana12.R;
import com.example.semana12.ui.producto.ProductoViewModel;

public class ReclamoFragment extends Fragment {

    private ReclamoViewModel reclamoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reclamoViewModel =
                ViewModelProviders.of(this).get(ReclamoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reclamo, container, false);
        final TextView textView = root.findViewById(R.id.text_reclamo);
        reclamoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

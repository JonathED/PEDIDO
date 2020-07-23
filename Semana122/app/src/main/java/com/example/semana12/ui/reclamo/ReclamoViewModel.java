package com.example.semana12.ui.reclamo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReclamoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReclamoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment --> Hola Mundo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
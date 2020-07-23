package com.example.semana12.ui.comprobante;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ComprobanteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ComprobanteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment --> Hola Mundo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
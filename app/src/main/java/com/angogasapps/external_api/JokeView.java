package com.angogasapps.external_api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;


import com.angogasapps.external_api.databinding.JokeViewBinding;
import com.bumptech.glide.Glide;

public class JokeView extends LinearLayout {
    private LayoutInflater inflater;
    private JokeViewBinding binding;


    public JokeView(Context context) {
        super(context);
        inflateView();
    }

    public JokeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflateView();
    }

    public JokeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateView();
    }

    public JokeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflateView();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        binding = JokeViewBinding.bind(getRootView());
    }

    private void inflateView(){
        inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.joke_view, this);
    }


    public void displayJoke(Joke joke){
        binding.text.setText(joke.getDescription());

        Glide
                .with(getContext())
                .load(joke.getGifURL())
                .centerCrop()
                .into(binding.image);
    }


}

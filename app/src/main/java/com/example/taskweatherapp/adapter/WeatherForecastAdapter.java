package com.example.taskweatherapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskweatherapp.R;
import com.example.taskweatherapp.network.Weather;

import java.util.List;

public class WeatherForecastAdapter extends RecyclerView.Adapter<WeatherForecastAdapter.ViewHolder> {

    private Context mContext;
    private List<Weather> mDataList;

    public WeatherForecastAdapter(Context context, List<Weather> dataList) {
        mContext = context;
        mDataList = dataList;
    }

    @NonNull
    @Override
    public WeatherForecastAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherForecastAdapter.ViewHolder holder, int position) {
        final Weather currentItem = mDataList.get(position);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iconImageView;
        private TextView cityTextView;
        private TextView temperatureTextView;
        private TextView dateTextView;
        private TextView descriptionTextView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImageView = itemView.findViewById(R.id.weather_icon);
            cityTextView = itemView.findViewById(R.id.city_name);
            temperatureTextView = itemView.findViewById(R.id.temperature);
            dateTextView = itemView.findViewById(R.id.date);
            descriptionTextView = itemView.findViewById(R.id.weather_description);
        }
    }
}

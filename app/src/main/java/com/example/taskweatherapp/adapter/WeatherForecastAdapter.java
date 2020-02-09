package com.example.taskweatherapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.taskweatherapp.R;
import com.example.taskweatherapp.network.pojo.CurrentWeather;
import com.example.taskweatherapp.network.pojo.FetchedWeatherData;
import com.example.taskweatherapp.network.pojo.Weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeatherForecastAdapter extends RecyclerView.Adapter<WeatherForecastAdapter.ViewHolder> {

    private Context mContext;
    private CurrentWeather mCurrentWeather;
    private Weather mForecastedWeather;

    private final String ICON_PATH = "https://openweathermap.org/img/wn/%s@2x.png";

    public WeatherForecastAdapter(Context context, FetchedWeatherData weatherData) {
        mContext = context;
        mCurrentWeather = weatherData.getCurrentWeather();
        mForecastedWeather = weatherData.getWeather();
    }

    @NonNull
    @Override
    public WeatherForecastAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherForecastAdapter.ViewHolder holder, int position) {
        if (position == 0) {
            String iconPath = getIconPath(mCurrentWeather.getWeatherGeneralList().get(0).getIconId());
            Glide.with(mContext)
                    .load(iconPath)
                    .into(holder.iconImageView);

            holder.cityTextView.setText(mCurrentWeather.getCityName());
            holder.temperatureTextView.setText(formatTemperature(mCurrentWeather.getTemperature().getTemp()));
            holder.dateTextView.setText(formatDate(mCurrentWeather.getCalculatedTimeUnix()));
            holder.descriptionTextView.setText(formatDescription(mCurrentWeather.getWeatherGeneralList().get(0).getDescription()));
        } else {
            String iconPath = getIconPath(mForecastedWeather.getWeatherList().get(position).getWeatherGeneralList().get(0).getIconId());
            Glide.with(mContext)
                    .load(iconPath)
                    .into(holder.iconImageView);

            holder.cityTextView.setText(mForecastedWeather.getLocation().getCityName());
            holder.temperatureTextView.setText(formatTemperature(mForecastedWeather.getWeatherList().get(position).getTemperature().getTemp()));
            holder.dateTextView.setText(formatDate(mForecastedWeather.getWeatherList().get(position).getForecastedTimeUnix()));
            holder.descriptionTextView.setText(formatDescription(mForecastedWeather.getWeatherList().get(position).getWeatherGeneralList().get(0).getDescription()));
        }
    }

    @Override
    public int getItemCount() {
        // Display only current weather and forecast for next 2 days
        return 3;
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

    private String getIconPath(String iconId) {
        return String.format(ICON_PATH, iconId);
    }

    private String formatTemperature(Double temperature) {
        return Math.round(temperature) + " \u2103";
    }

    private String formatDate(long unixDate) {
        // Convert seconds to milliseconds
        Date date = new Date(unixDate * 1000L);
        // Choose date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        // Set a timezone reference for formatting
        sdf.setTimeZone(java.util.TimeZone.getDefault());
        return sdf.format(date);
    }

    // Capitalize first letter of description string
    private String formatDescription(String description) {
        return description.substring(0, 1).toUpperCase() + description.substring(1);
    }
}

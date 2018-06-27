package com.dalydays.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;
    private int mPlaybackSpeedValue;
    private int mPlaybackSpeedDisplay;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public int getPlaybackSpeedValue() {
        return mPlaybackSpeedValue;
    }

    public void setPlaybackSpeedValue(int progress) {
        mPlaybackSpeedValue = progress;
    }

    @Bindable
    public String getPlaybackSpeedDisplay() {
        return Integer.toString(mPlaybackSpeedDisplay);
    }

    public void setPlaybackSpeedDisplay(int progress) {
        mPlaybackSpeedDisplay = progress;
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound, mPlaybackSpeedValue);
    }
}

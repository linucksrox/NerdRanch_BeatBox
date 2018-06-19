package com.dalydays.android.beatbox;

import android.support.v4.app.Fragment;
import com.dalydays.android.criminalintent.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}

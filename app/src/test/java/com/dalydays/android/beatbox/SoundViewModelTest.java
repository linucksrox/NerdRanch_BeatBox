package com.dalydays.android.beatbox;

import org.junit.Before;

import static org.mockito.Mockito.mock;

public class SoundViewModelTest {
    private BeatBox mBeatbox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatbox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatbox);
        mSubject.setSound(mSound);
    }
}
package com.example.android.DanskOrd;


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Dansk translation, and an image for that word.
 */
public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Dansk translation for the word */
    private String mDanskTranslation;
    /** Audio resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Image resource ID for the word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Constant value that represents no image was provided for this word */
    private int mAudioResourceId;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param danskTranslation is the word in the Dansk language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String danskTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mDanskTranslation = danskTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param danskTranslation is the word in the Dansk language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String danskTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mDanskTranslation = danskTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Dansk translation of the word.
     */
    public String getDanskTranslation() {
        return mDanskTranslation;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId(){ return mAudioResourceId;}

}

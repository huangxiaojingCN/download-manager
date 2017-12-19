package com.novoda.downloadmanager;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

class AndroidLocalFilesDirectory implements LocalFilesDirectory {

    private final Context context;

    AndroidLocalFilesDirectory(Context context) {
        this.context = context;
    }

    @Override
    public List<String> contents() {
        return Arrays.asList(context.getFilesDir().list());
    }

    @Override
    public boolean deleteFile(String filename) {
        return context.deleteFile(filename);
    }
}
package com.drakor.interfaces;

import com.drakor.item.ItemAlbums;

import java.util.ArrayList;

public interface AlbumsListener {
    void onStart();

    void onEnd(String success, String verifyStatus, String message, ArrayList<ItemAlbums> arrayList);
}
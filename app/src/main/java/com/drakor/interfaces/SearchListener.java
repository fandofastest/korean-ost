package com.drakor.interfaces;

import com.drakor.item.ItemAlbums;
import com.drakor.item.ItemArtist;
import com.drakor.item.ItemSong;

import java.util.ArrayList;

public interface SearchListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemSong> arrayListSong, ArrayList<ItemArtist> arrayListArtist, ArrayList<ItemAlbums> arrayListAlbums);
}

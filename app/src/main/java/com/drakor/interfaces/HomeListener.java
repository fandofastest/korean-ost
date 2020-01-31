package com.drakor.interfaces;

import com.drakor.item.ItemAlbums;
import com.drakor.item.ItemArtist;
import com.drakor.item.ItemHomeBanner;
import com.drakor.item.ItemSong;

import java.util.ArrayList;

public interface HomeListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemHomeBanner> arrayListBanner, ArrayList<ItemAlbums> arrayListAlbums, ArrayList<ItemArtist> arrayListArtist, ArrayList<ItemSong> arrayListSongs);
}

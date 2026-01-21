package com.example.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {

    private final List<Advertisement> videos = new ArrayList<>();

    private AdvertisementStorage() {
        Object someContent = new Object();
        add(new Advertisement(someContent, "First Video", 5000,
                100, 3 * 60));
        add(new Advertisement(someContent, "Second Video", 500,
                10, 15 * 60));
        add(new Advertisement(someContent, "Third Video", 400,
                22, 10 * 60));
    }

    private static class InstanceHolder {
        private static final AdvertisementStorage ourInstance = new AdvertisementStorage();
    }

    public static AdvertisementStorage getInstance() {
        return InstanceHolder.ourInstance;
    }

    public List<Advertisement> list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}

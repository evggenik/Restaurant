package com.example.ad;


public class AdvertisementManager {

    private int timeSeconds;
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty())
            throw new NoVideoAvailableException();
//        Collections.sort(storage.list(), new Comparator<Advertisement>() {
//            @Override
//            public int compare(Advertisement o1, Advertisement o2) {
//                return 0;
//            }
//        });
    }
}

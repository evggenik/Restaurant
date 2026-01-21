package com.example.ad;

public class AdvertisementStorage {
    private AdvertisementStorage() {
    }

    private static class InstanceHolder {
        private static final AdvertisementStorage ourInstance = new AdvertisementStorage();
    }

    public static AdvertisementStorage getInstance() {
        return InstanceHolder.ourInstance;
    }
}

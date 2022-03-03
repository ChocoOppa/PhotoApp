package com.quocanh.photoapp;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://images.unsplash.com/photo-1490885578174-acda8905c2c6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1469&q=80", "Pineapple",
                "Pineapples have yellow or white pulp, fleshy, aromatic, juicy and sweet. In the fruit there is a fibrous axis that extends from the crown to the pedicle. Mature pineapples have a very singular fragrance, a beautiful colour and pleasant bittersweet taste."));
        photos.add(new Photo(1, "https://images.unsplash.com/photo-1528821154947-1aa3d1b74941?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80", "Cherry", "The fruit is a fleshy drupe (stone fruit) that is generally heart-shaped to nearly globular, about 2 cm (1 inch) in diameter, and varies in colour from yellow through red to nearly black. The acid content of the sweet cherry is low. The higher acid content of the sour cherry produces its characteristic tart flavour."));
        photos.add( new Photo(2,"https://images.unsplash.com/photo-1547514701-42782101795e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Orange",""));
        photos.add( new Photo(3,"https://images.unsplash.com/photo-1523049673857-eb18f1d7b578?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1375&q=80","Avocado",""));
        photos.add( new Photo(4,"https://images.unsplash.com/photo-1587393855524-087f83d95bc9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=760&q=80","Strawberry",""));
        photos.add( new Photo(5,"https://images.unsplash.com/photo-1579613832125-5d34a13ffe2a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80","Apple",""));
        photos.add( new Photo(6,"https://images.unsplash.com/photo-1580636521086-7b0c742dd567?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80","Pomegranate",""));
        photos.add( new Photo(7,"https://images.unsplash.com/photo-1526318472351-c75fcf070305?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Papaya",""));
        photos.add( new Photo(8,"https://images.unsplash.com/photo-1615484477778-ca3b77940c25?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","Pear",""));
        photos.add( new Photo(9,"https://images.unsplash.com/photo-1498557850523-fd3d118b962e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1469&q=80","Blueberry",""));
        return photos;
    }

    public static Photo getPhotoFromId(int id) {
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i<phs.size();i++) {
            if (phs.get(i).getId() == id) {
                return phs.get(i);
            }
        }
        return null;
    }
}

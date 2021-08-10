package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 4:11 PM
*/

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {

        // Let us create 10 Locations.
        List<Location> locations = IntStream.range(0, 5)
                .boxed()
                .flatMap(i -> IntStream.range(0, 2)
                    .mapToObj(j -> new Location(i, j)))
                .collect(Collectors.toList());

        System.out.println("total number of locations is : " + locations.size());

        // Let us declare three stars (A,B & C)
        List<String> starNames = List.of("A", "B", "C");
        List<Color> starColors = List.of(Color.RED, Color.BLUE, Color.YELLOW);

        // Now we will create 90 star objects as shown earlier

        List<StarObject> starObjects = starNames.stream()
                .flatMap(starName -> starColors.stream()
                        .flatMap(starColor -> locations.stream()
                                .map(location -> new StarObject(starName, starColor, location))))
                .collect(Collectors.toList());

        System.out.println("total number of stars is : " + starObjects.size());

        Set<Star> uniqueStars = starObjects.stream()
                .map(StarObject::getStar)
                .collect(Collectors.toSet());

        System.out.println("total number of unique stars is : " + uniqueStars.size());

    }
}

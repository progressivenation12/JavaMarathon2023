package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Tame impala", 2007);
        MusicBand band2 = new MusicBand("The Cure", 1976);
        MusicBand band3 = new MusicBand("The Beatles", 1960);
        MusicBand band4 = new MusicBand("Skryptonite", 2018);
        MusicBand band5 = new MusicBand("Pompeya", 2006);
        MusicBand band6 = new MusicBand("Пасош", 2014);
        MusicBand band7 = new MusicBand("Jefferson  Airplane", 1965);
        MusicBand band8 = new MusicBand("Jimi Hendrix", 1966);
        MusicBand band9 = new MusicBand("Kedr Linanskiy", 2008);
        MusicBand band10 = new MusicBand("Кровосток", 2003);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(band1);
        musicBandList.add(band2);
        musicBandList.add(band3);
        musicBandList.add(band4);
        musicBandList.add(band5);
        musicBandList.add(band6);
        musicBandList.add(band7);
        musicBandList.add(band8);
        musicBandList.add(band9);
        musicBandList.add(band10);

        Collections.shuffle(musicBandList); //shuffle - перемешивает

        System.out.println(musicBandList);

        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        List<MusicBand> musicBandBefore2000 = new ArrayList<>();

        for (MusicBand  band : musicBandList) {
            if (band.getYear() > 2000) {
                musicBandAfter2000.add(band);
            }
        }

        for (MusicBand  band : musicBandList) {
            if (band.getYear() < 2000) {
                musicBandBefore2000.add(band);
            }
        }

        System.out.println("musicBandAfter2000");

        for (MusicBand band : musicBandAfter2000) {
            System.out.println(band);
        }

        System.out.println("musicBandBefore2000");

        for (MusicBand band : musicBandBefore2000) {
            System.out.println(band);
        }
    }
}
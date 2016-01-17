package module8;

import module8.task1file.File;
import module8.task2flower.Flower;
import module8.task3musicalinstrument.MusicalInstrument;

import java.util.List;

public class CollectionSort {

    public static List<File> sortFilesList(List<File> list){

        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                String name1 = list.get(i).toString();
                String name2 = list.get(j).toString();

                if (name1.compareTo(name2) > 0){
                    File temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<Flower> sortFlowersList(List<Flower> list){

        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                String name1 = list.get(i).toString();
                String name2 = list.get(j).toString();

                if (name1.compareTo(name2) > 0){
                    Flower temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<MusicalInstrument> sortInstrumentsList(List<MusicalInstrument> list){

        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                String name1 = list.get(i).toString();
                String name2 = list.get(j).toString();

                if (name1.compareTo(name2) > 0){
                    MusicalInstrument temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}

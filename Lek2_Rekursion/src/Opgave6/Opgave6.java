package Opgave6;

import java.io.File;

public class Opgave6 {
    public static void main(String[] args) {
        ScanDir("C:\\Users\\jakob\\Desktop\\speedrun\\Minecraft\\wall");
        System.out.println(ScanDirCount("C:\\Users\\jakob\\AppData\\Roaming\\.minecraft\\saves\\Random Speedrun #468"));
    }
    public static int ScanDirCount(String path) {
        int result = 0;
        File file = new File(path);
        String[] names = file.list();
        for (String name : names) {
            File file2 = new File(path + "\\" + name);
            if (file2.isDirectory()) {
                result++;
            }
        }
        return result;
    }

    public static void ScanDir(String path) {
        ScanDir(path, 1);
    }

    public static void ScanDir(String path, int count) {
        String s = "\t";
        System.out.println("[DIR]  " + s.repeat(count) + path);
        // skab et File-objekt svarende til mappen path
        File file=new File(path);
        // få listen over alle filer og undermapper
        String[] names=file.list();
        for (String name: names) {
            File file2=new File(path+"\\"+name);
            if (file2.isDirectory()) {
                ScanDir(path + "\\" + name, count+1);
            }
        }
    }
}

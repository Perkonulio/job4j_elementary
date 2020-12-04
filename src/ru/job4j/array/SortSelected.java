package ru.job4j.array;

public class SortSelected {
    public int[] dataFormat(int[] data) {
        FindLoop findLoop = new FindLoop();
        MinDiapason minDiapason = new MinDiapason();
        SwitchArray switchArray = new SwitchArray();
        for (int i = 0; i < data.length - 1; i++) {
            int min = minDiapason.findMin(data, i, data.length - 1);
            int index = findLoop.loopFromArrayInRange(data, min, i, data.length - 1);
            switchArray.swap(data, i, index);
        }
        return data;
    }
}

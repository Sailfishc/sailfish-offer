package com.sailfish.iterator;

/**
 * @author sailfish
 * @create 2017-06-15-下午2:45
 */
public class Calcution {

    static class Status {
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public static boolean compareInt(int a, int b) {
        if (a + 1 != b) {
            return false;
        }
        return true;
    }


    //这不是一个好的算法
    public static void calcutions() {
        int[] arr = {1, 3, 4, 5, 6, 9, 10};
        Status status = new Status();
        //这里忽略了边界，会出现ArrayIndexOutOfBoundsException
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                continue;
            }
            status.setStart(i);
            status.setEnd(i);

            int count = 0;
            for (int j = i + 1; j < arr.length - 1; j++) {

                boolean flag = compareInt(arr[j], arr[j + 1]);
                if (flag) {
                    count++;
                } else {
                    break;
                }
            }

            if (count > (status.getEnd() - status.getStart())) {
                status.setEnd(status.getStart() + count);
            }
        }

        for (int i = status.getStart(); i < status.getEnd() - 1; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void calcutions2() {
        int[] arr = {1, 3, 4, 5, 6, 9, 10};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + 1 != arr[i + 1]) {
                continue;
            }

            //进行后续操作
            i++;


        }

    }

    public static void main(String[] args) {

        calcutions();
    }
}

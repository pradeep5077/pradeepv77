package com;

import java.util.*;

public class Main {
    private static ArrayList<Object> list;
    /*
     * Each segment represents a text segment and will have a startIndex and an endIndex. Define the groupSegments method
     * to group these segments to Group these segments onto parent segments. Segments that is a subset of another segment
     * must belong to a group key with the outermost segment.
     * */

    public static void main(String[] args) {
        ArrayList<Segment> input = new ArrayList<>();
        HashMap<Integer, Iterator> hmap = new HashMap<>();
        input.add(new Segment(0, 5));
        input.add(new Segment(2, 3));
        input.add(new Segment(4, 6));
        input.add(new Segment(4, 5));
        Iterator iterator = input.iterator();
        while (iterator.hasNext()) {

            iterator.next();
        }
        /* Get values based on key*/

        Iterator iterator2 = input.iterator();
        while (iterator2.hasNext()) {
            Segment t=(Segment) iterator2.next();


        }
        for (int i=0;i<input.size();i++){
            Segment t=(Segment)input.get(i);
            System.out.println(t.getStartIndex()+" "+t.getEndIndex());
        }
        for (int j = 0; j < list.size(); j++) {
            Segment t = (Segment)list.get(j);
            System.out.println(t.getStartIndex() + " " + t.getEndIndex());
        }



        Map<Segment, List<Segment>> groupedSegments = groupSegments(input);

        /*
        Expected out put
        (0,5)
            [(0,5), (2,3)]
        (4,6)
            [(4,6), (4,5)]
        */

    }

    private static Map<Segment, List<Segment>> groupSegments(List<Segment> Segments) {
        return new HashMap<>();
    }

    private static Map<Segment, List<Segment>> groupSegments(ArrayList<Segment> input) {
        return null;
    }
}

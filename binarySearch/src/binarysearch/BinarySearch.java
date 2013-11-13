/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;

/**
 *
 * @author chubi
 */
public class BinarySearch {

    public int SearchWithBSA(ArrayList list, int dataSearch, int start, int end, int pos) {

        pos = (start + end) / 2;
        int dataPos = (int) list.get(pos);

        if (dataPos == dataSearch) {
            return pos;
        } else {
            if (dataPos < dataSearch) {
                start = pos + 1;
                return SearchWithBSA(list, dataSearch, start, end, pos);
            } else {
                end = pos - 1;
                return SearchWithBSA(list, dataSearch, start, end, pos);
            }
        }
        //return -1;
    }
}

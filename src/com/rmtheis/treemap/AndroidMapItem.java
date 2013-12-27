/*
 * Copyright 2013 Robert Theis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rmtheis.treemap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import android.graphics.RectF;
import edu.umd.cs.treemap.MapItem;
import edu.umd.cs.treemap.Rect;

public class AndroidMapItem extends MapItem implements AndroidMappable, Comparable<AndroidMapItem> {
    private double weight;
    private String label;

    public AndroidMapItem(double weight, String label) {
        this.label = label;
        setSize(weight);
    }

    public String getLabel() {
        return label;
    }

    /** Return an Android RectF that is the size of the bounds rectangle */
    public RectF getBoundsRectF() {
        Rect bounds = getBounds();
        return new RectF(Double.valueOf(bounds.x).floatValue(),
                Double.valueOf(bounds.y).floatValue(),
                Double.valueOf(bounds.x).floatValue() + Double.valueOf(bounds.w).floatValue(),
                Double.valueOf(bounds.y).floatValue() + Double.valueOf(bounds.h).floatValue());
    }

    public static <T extends Comparable<? super T>> ArrayList<T> asReverseSortedList(
            Collection<T> collection) {
        ArrayList<T> arrayList = new ArrayList<T>(collection);
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    @Override
    public int compareTo(AndroidMapItem otherItem) {
        return Double.compare(weight, otherItem.weight);
    }

    @Override
    public String toString() {
        return AndroidMapItem.class.getSimpleName() + "[label=" + label + ",weight=" + weight + 
                ",bounds=" + getBounds().toString() + 
                ",boundsRectF=" + getBoundsRectF().toString() + "]";
    }
}
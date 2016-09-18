package com.sing.datetimepicker.date;

import android.content.Context;
/**
 * @className   SimpleMonthAdapter
 * @time        2016/9/18 14:02
 * @author      LiangYx
 * @description An adapter for a list of {@link SimpleMonthView} items.
 */
public class SimpleMonthAdapter extends MonthAdapter {

    public SimpleMonthAdapter(Context context, DatePickerController controller) {
        super(context, controller);
    }

    @Override
    public MonthView createMonthView(Context context) {
        final MonthView monthView = new SimpleMonthView(context, null, mController);
        return monthView;
    }
}

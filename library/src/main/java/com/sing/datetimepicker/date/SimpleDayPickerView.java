package com.sing.datetimepicker.date;

import android.content.Context;
import android.util.AttributeSet;
/**
 * @className   SimpleDayPickerView
 * @time        2016/9/18 14:02
 * @author      LiangYx
 * @description A DayPickerView customized for {@link SimpleMonthAdapter}
 */
public class SimpleDayPickerView extends DayPickerView {

    public SimpleDayPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleDayPickerView(Context context, DatePickerController controller) {
        super(context, controller);
    }

    @Override
    public MonthAdapter createMonthAdapter(Context context, DatePickerController controller) {
        return new SimpleMonthAdapter(context, controller);
    }
}